package com.codegym;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String fileName = "contries.csv";
        CsvWriterExample.writeCsvFile(fileName);

        try {
            BufferedReader br = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = br.readLine()) !=null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
