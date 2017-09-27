package com.company;
import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.List;
import java.util.Scanner;

class EditorTest {

    @Test
    void writeToFile() {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] str = input.split(" ");

        try(FileWriter fileWriter = new FileWriter("1.txt");
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

    @Test
    void writeToFile1() {
    }

    @Test
    void readFromFile() {
    }

    @Test
    void appendToFile() {
    }

    @Test
    void appendToLine() {
    }
}