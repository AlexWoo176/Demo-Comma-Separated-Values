package com.codegym;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CsvWriterExample {
    public static final String COMMA_DELIMITER = ",";
    public static final String NEW_LINE_SEPARATOR = "\n";
    public static final String FILE_HEADER = "id,code,name";

    public static void writeCsvFile(String fileName) {
        Country country1 = new Country(1, "US", "United States");
        Country country2 = new Country(2, "VN", "Viet Nam");
        Country country3 = new Country(3, "AU", "Australia");

        List<Country> countries = new ArrayList<>();
        countries.add(country1);
        countries.add(country2);
        countries.add(country3);

        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileName);
            fileWriter.append(FILE_HEADER);
            fileWriter.append(NEW_LINE_SEPARATOR);

            for (Country country : countries) {
                fileWriter.append(String.valueOf(country.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getCode());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(country.getName());
                fileWriter.append(NEW_LINE_SEPARATOR);
            }
            System.out.println("CSV file was created Successfully!!!");
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }

        }

    }
}
