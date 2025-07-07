package dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadEnv {

        public static Properties loadEnv(String path) throws IOException {
            Properties props = new Properties();
            FileInputStream fis = new FileInputStream(path);
            props.load(fis);
            fis.close();
            return props;
        }

}
