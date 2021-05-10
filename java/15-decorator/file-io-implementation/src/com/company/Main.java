package com.company;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        int c;

        StringBuffer stringBuffer = new StringBuffer("Jason Fedin aaaBBBBcccDDDD");
        byte[] bytes = stringBuffer.toString().getBytes();

        try {
            InputStream in = new LoweCaseInputStream(new ByteArrayInputStream(bytes));
            while((c = in.read()) >= 0) {
                System.out.print((char) c);
            }

            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
