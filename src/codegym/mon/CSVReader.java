package codegym.mon;

import java.io.*;

public class CSVReader {
    public static void main(String[] args) {
        String csvFile = "country.csv";
        String line = "";
        String csvSplitby = ",";

        File file = null;
        BufferedReader br = null;

        try {
            file = new File(csvFile);
            br = new BufferedReader(new FileReader(csvFile));

           while ((line = br.readLine()) != null) {
               String[] country = line.split(csvSplitby);
               System.out.println("Country [ID = " + country[3] + ", Code = " + country[4] + ",Nname =" +country[5] + "]");

           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
