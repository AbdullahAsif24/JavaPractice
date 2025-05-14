import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        try {
            String filePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\Date-ProductID-BuyerID-Region-QTY-Price.txt";
            String Line = "";
            File myFile = new File(filePath);
            Scanner fileToRead = new Scanner(myFile);
            Line = fileToRead.nextLine();
            double totalPrice = 0;
            while (fileToRead.hasNextLine()) {
                Line = fileToRead.nextLine();
                // Split the line into an array of strings
                String[] data = Line.split("\t");
                double price = Double.parseDouble(data[5]);
                totalPrice += price;
            }
            System.out.println(totalPrice);
            fileToRead.close();
        } catch (FileNotFoundException ff) {
            System.out.println("File not found " + ff);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}