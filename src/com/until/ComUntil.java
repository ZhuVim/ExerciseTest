package com.until;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ComUntil {
    static public boolean WriteFile(String filename, String content) {
        try {
            //ʹ��������캯��ʱ���������kuka.txt�ļ���
            //���Ȱ�����ļ���ɾ������Ȼ�󴴽��µ�kuka.txt
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
