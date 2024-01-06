package org.util.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 设置一个 properties 里面的某个东西的值
 * @author 8043
 */

public class SetPro {
    /**
     * 设置一个 properties 里面的某个东西的值
     * @param File 文件
     * @param Vel 东西
     * @param St 值
     * @param tag 注释上的那个
     */
    public static void SetPro(String File, String Vel, String St, String tag) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(File.replace("*fsr*", java.io.File.separator)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties.setProperty(Vel, St);

        try {
            properties.store(new FileOutputStream(File.replace("*fsr*", java.io.File.separator)), tag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
