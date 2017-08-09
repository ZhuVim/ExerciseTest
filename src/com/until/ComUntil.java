package com.until;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public static String readTxtFile(String filePath) {
        try {
            String encoding = "GBK";
            StringBuffer stringBuffer = new StringBuffer();
            File file = new File(filePath);
            if (file.isFile() && file.exists()) { //判断文件是否存在
                InputStreamReader read = new InputStreamReader(new FileInputStream(file), encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                while ((lineTxt = bufferedReader.readLine()) != null) {
                    stringBuffer.append(lineTxt);

                }
                read.close();
            } else {
                System.out.println("找不到指定的文件");
            }
            return stringBuffer.toString();
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
            return null;
        }

    }
}
