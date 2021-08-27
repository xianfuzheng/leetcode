package com.zheng.misc;

import java.util.*;

public class CalcEquation {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {

        Map<String, Map<String,Double>> m=new HashMap<>();
        for(int i=0;i<values.length;i++){
            String var1=equations.get(i).get(0), var2=equations.get(i).get(1);
            m.putIfAbsent(var1,new HashMap<>());
            m.putIfAbsent(var2,new HashMap<>());

            m.get(var1).put(var2,values[i]);
            m.get(var2).put(var1,1/values[i]);
        }

        double res[]=new double[queries.size()];
        for(int i=0;i<queries.size();i++){
            List<String> querie = queries.get(i);
            res[i] = get_ans(querie.get(0), querie.get(1),  new HashSet<>(),m);
        }
        return res;
    }

    private double get_ans(String start, String end, Set<String> vis, Map<String,Map<String,Double>> m){
        if(m.containsKey(start) && m.containsKey(end)){
           /* if(start.equals(end))   return 1D;
            vis.add(start);
            Queue<Pair<String,Double>> q= new LinkedList<>();
            q.add(new Pair<>(start,1D));
            while(!q.isEmpty()){
                Pair<String,Double> x=q.poll();
                start=x.getKey();
                double val=x.getValue();
                if(m.containsKey(start)){
                    Map<String,Double> childs=m.get(start);
                    for(String i:childs.keySet()){
                        if(!vis.contains(i)){
                            double newVal=val*(childs.get(i));
                            if(i.equals(end))   return newVal;
                            q.add(new Pair<>(i,newVal));
                            vis.add(i);
                        }
                    }
                }
            }*/
        }
        return -1D;
    }
}
