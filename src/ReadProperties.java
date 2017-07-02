import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) {
        Properties prop = new Properties();
        try {
            //��ȡ�����ļ�a.properties
            InputStream in = new BufferedInputStream(new FileInputStream("src/a.properties"));
            prop.load(in); ///���������б�
            Iterator<String> it = prop.stringPropertyNames().iterator();
            String key = "name";
            System.out.println(prop.getProperty(key));
            //            while (it.hasNext()) {
            //                String key = it.next();
            //                System.out.println(key + ":" + prop.getProperty(key));
            //            }
            in.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
