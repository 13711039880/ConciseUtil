package front.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.util.NewThread.run;

/**
 * NewThread前置
 * @author 8043
 * @see org.util.NewThread
 */

public class NewThread extends Thread {
    @Override
    public void run() {
        Method thread;

        try {
            thread = run.getMethod("add", Object.class);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

        try {
            thread.invoke(null, 1);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }
}
