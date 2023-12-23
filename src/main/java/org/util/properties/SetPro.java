package org.util.properties;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class SetPro {
    public static void SetPro(String File, String Vel, String St, String tag) {
        Properties properties = new Properties();

        try {
            properties.load(new FileInputStream(File));
        } catch (IOException e) {
            e.printStackTrace();
        }

        properties.setProperty(Vel, St);

        try {
            properties.store(new FileOutputStream(File), tag);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
