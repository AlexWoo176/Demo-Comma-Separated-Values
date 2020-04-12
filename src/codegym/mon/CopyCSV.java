package codegym.mon;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyCSV {
    public static void main(String[] args) {
        File infile = new File("/home/alexwoo/IdeaProjects/country.csv");
        File outfile = new File("country.csv");
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(infile);
            fileOutputStream = new FileOutputStream(outfile);

            byte[] bytes = new byte[1024];
            int length;
            while ((length=fileInputStream.read(bytes)) > 0) {
                fileOutputStream.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
                System.out.println("File copied successfully!!");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
