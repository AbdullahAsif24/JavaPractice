import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Question12 {
    // QUESTION 12
    // Write java code that prints all the record sorted in descending order with
    // respect to sales amount
    public static void main() {
        try {
            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            String[] fields;
            ArrayList<Integer> ammount = new ArrayList<>();

            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);

            line = fileToRead.nextLine();
            while (fileToRead.hasNext()) {
                line = fileToRead.nextLine();
                fields = line.split("\t");

                int qty = Integer.parseInt(fields[3]);
                int unitPrice = Integer.parseInt(fields[2]);
                ammount.add( qty * unitPrice) ;
            }

            // sort ammount array in desc order
            Collections.sort(ammount, Collections.reverseOrder());
            
            System.out.println(ammount);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
