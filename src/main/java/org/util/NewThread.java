package org.util;

public class NewThread {
    public static Class<?> run;

    public static void run(Class<?> run) {
        NewThread.run = run;

        front.util.NewThread add = new front.util.NewThread();
        add.start();
    }
}
