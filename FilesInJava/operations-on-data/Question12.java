import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question12 {
    // QUESTION 12
    // Write java code that prints all the record sorted in descending order with
    // respect to sales amount
    public static void main(String[] args) {
        try {
            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            String header = "";
            String[] fields;
            List<String[]> records = new ArrayList<>();

            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);

            header = fileToRead.nextLine();
            while (fileToRead.hasNext()) {
                line = fileToRead.nextLine();
                fields = line.split("\t");

                records.add(fields);
            }
            fileToRead.close();

            records.sort((a, b)->{
                int AmmountA = Integer.parseInt(a[2]);
                int qtyA = Integer.parseInt(a[3]);
                int sellPriceA = AmmountA*qtyA;
                
                int AmmountB = Integer.parseInt(b[2]);
                int qtyB = Integer.parseInt(b[3]);
                int sellPriceB = AmmountB*qtyB;

                return Integer.compare(sellPriceB, sellPriceA);
            });

            System.out.println(header);

            for (int i = 0; i < records.size(); i++) {
                String[] record = records.get(i);
                System.out.println(String.join("\t", record));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
