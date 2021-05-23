package com.company;

public class Main {

    public static void main(String[] args) {
        FileWriterCaretaker fileWriterCaretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriterUtil = new FileWriterUtil("data.txt");
        fileWriterUtil.write("First Set of Data:\nMyra\nLucy\n");

        System.out.println(fileWriterUtil + "\n\n");

        // Let's save the file
        fileWriterCaretaker.save(fileWriterUtil);

        // Now write something else
        fileWriterUtil.write("Second set of data:\nJason\n");

        // Checking file contents
        System.out.println(fileWriterUtil + "\n");

        // Let's undo to last save
        fileWriterCaretaker.undo(fileWriterUtil);

        // Checking file contents again
        System.out.println(fileWriterUtil + "\n\n");
    }
}
