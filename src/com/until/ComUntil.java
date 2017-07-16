package com.until;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComUntil {
    static public boolean WriteFile(String filename, String content) {
        try {
            //使用这个构造函数时，如果存在kuka.txt文件，
            //则先把这个文件给删除掉，然后创建新的kuka.txt
            FileWriter writer = new FileWriter(filename);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static String readFile(String filename) {

        int c = 0;
        StringBuffer stringBuffer = new StringBuffer();
        try {
            FileReader reader = new FileReader(filename);
            c = reader.read();
            while (c != -1) {

                c = reader.read();
                stringBuffer.append(c);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuffer.toString();
    }
}
