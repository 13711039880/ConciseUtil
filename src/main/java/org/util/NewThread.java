package org.util;

import org.jetbrains.annotations.NotNull;

/**
 * 新线程
 * @author 8043
 * @see front.util.NewThread
 */

public class NewThread {
    public static Class<?> run;

    /**
     * 新线程
     * @param run 想要新线程的class
     * @return Thread
     */
    public static Thread run(@NotNull Class<?> run) {
        NewThread.run = run;

        front.util.NewThread add = new front.util.NewThread();
        add.start();

        return add;
    }
}
