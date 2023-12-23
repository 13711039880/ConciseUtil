package org.util;

public class err {
    public static void directed(String text) {
        throw new RuntimeException(text);
    }

    public static void undirected(String text) {
        System.err.println(text);
    }
}
