package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Editor {
    public static void writeToFile(String fileName, List<String> listString){
        try(FileWriter fileWriter = new FileWriter(fileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            for(String str: listString){
                bufferedWriter.write(str + "\n");
                // bufferedWriter.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }

    public static void writeToFile(String s1, String s2) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(s1);
            bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write(s2 + "\n");
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileWriter != null)
                    fileWriter.close();
                if (bufferedWriter != null)
                    bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static List<String> readFromFile(String s1) {

        List<String> list = new ArrayList<>();

        try (FileReader fileReader = new FileReader(s1);
             BufferedReader bufferedReader =
                     new BufferedReader(fileReader)) {
            String row;
            int position = 0;
            while ((row = bufferedReader.readLine()) != null) {
                list.add(row);
                position++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void appendToFile(String s1, String s2) {
        try (FileWriter f = new FileWriter(s1, true);
             BufferedWriter b = new BufferedWriter(f);
             PrintWriter p = new PrintWriter(b);) {
            p.println(s2);
        } catch (IOException i) {
            i.printStackTrace();
        }
    }

    public static void appendToLine(String filename, String stringValue, int position) {
        List<String> strings = readFromFile(filename);
        strings.add(position, stringValue);
        writeToFile(filename, strings);
    }
}
