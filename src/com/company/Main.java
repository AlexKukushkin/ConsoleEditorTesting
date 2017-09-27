package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.company.Editor.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("command: ");
        String input = scanner.nextLine();
        String[] str = input.split(" ");
        System.out.println("-- Entered by user --");
        for (String s : input.split(" ", 0)) {
            System.out.println(s);
        }
        System.out.println("---------------------");

        if (str[0].equals("read")) {
            List<String> strings = readFromFile(str[1]);

            for (String string : strings) {
                System.out.println(string);
            }

        }
        if (str[0].equals("write")) {
            writeToFile(str[1], str[2]);
            readFromFile(str[1]);
        }
        if (str[0].equals("append")) {
            appendToFile(str[1], str[2]);
            readFromFile(str[1]);
        }
        if (str[0].equals("appendToLine")){
            appendToLine(str[1], str[2], Integer.parseInt(str[3]));
        }
    }


}
