package org.util.properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadPro {
    public static String ReadPro(String Fe, String Ve) {
        String Va = null;

        try {
            FileInputStream in = new FileInputStream(Fe.replace("*fsr*", File.separator));
            Properties properties = new Properties();
            properties.load(in);
            in.close();
            Va = properties.getProperty(Ve);
        } catch (Exception Read_info) {
            Read_info.getMessage();
        }

        return Va;
    }
}
