package org.util.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

/**
 * 获取一个 properties 里面的某个东西的值
 * @author 8043
 */

public class ReadPro {
    /**
     * 获取一个 properties 里面的某个东西的值
     * @param Fe 文件
     * @param Ve 东西
     * @return 值
     */
    public static String ReadPro(String Fe, String Ve) {
        String Va = null;

        try {
            FileInputStream in = new FileInputStream(Fe.replace("*fsr*", File.separator));
            Properties properties = new Properties();
            properties.load(in);
            in.close();
            Va = properties.getProperty(Ve);
        } catch (Exception e) {
            e.getMessage();
        }

        return Va;
    }
}
