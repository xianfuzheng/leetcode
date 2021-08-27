package com.zheng.misc;

public class BoundedBlockingQueue {
    int[] que;
    int capacity;
    int front = -1;
    int rear = -1;

    public BoundedBlockingQueue(int capacity) {
        this.que = new int[capacity];
        this.capacity = capacity;
    }

    public void enqueue(int element) throws InterruptedException {
        synchronized (que) {
            while ((rear + 1) % capacity == front) {
                que.wait();
            }

            if (front == -1 && rear == -1) {
                front = 0;
                rear = 0;
                que[rear] = element;
            } else {

                rear = (rear + 1) % capacity;
                que[rear] = element;

            }
            que.notifyAll();
        }
    }

    public int dequeue() throws InterruptedException {
        int poll = 0;
        synchronized (que) {
            while (front == -1 && rear == -1) {
                que.wait();
            }

            if (front == rear) {
                poll = que[front];
                front = -1;
                rear = -1;
            } else {
                poll = que[front];
                front = (front + 1) % capacity;

            }

            que.notifyAll();

        }
        return poll;
    }

    public int size() {
        synchronized (que) {
            if (front == -1 && rear == -1)
                return 0;
            return (rear + 1) % capacity - (front + 1) % capacity + 1;
        }
    }
}
