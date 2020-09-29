package com.zheng;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;

public class TestUtils {

    public static String loadString(String fileName) {
        InputStream resourceAsStream = TestUtils.class.getResourceAsStream("/"+fileName);
        final int bufferSize = 1024;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(resourceAsStream, StandardCharsets.UTF_8);
        int charsRead;
        try {
            while((charsRead = in.read(buffer, 0, buffer.length)) > 0) {
                out.append(buffer, 0, charsRead);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return out.toString();
    }
}
