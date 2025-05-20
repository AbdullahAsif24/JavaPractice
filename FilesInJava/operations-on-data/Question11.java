import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Question11 {
    // QUESTION 11:
    // Write java code to display monthwise sales
    // function to total sell ammount for every product
    public static void main() {
        try {
            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";

            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);

            line = fileToRead.nextLine();

            line = fileToRead.nextLine();
            String[] fields = line.split("\t");
            ArrayList<String> months = new ArrayList<>();
            months.add(fields[4].split("/")[0]);

            while (fileToRead.hasNext()) {
                if (months.contains(fields[4].split("/")[0])) {
                    line = fileToRead.nextLine();
                    fields = line.split("\t");
                } else {
                    months.add(fields[4].split("/")[0]);

                    line = fileToRead.nextLine();
                    fields = line.split("\t");
                }

            }
            System.out.println(months);

            fileToRead.close();

            for (int i = 0; i < months.size(); i++) {
                File myFile2 = new File(myFilePath);
                Scanner fileToRead2 = new Scanner(myFile2);
                String line2 = "";
                int total = 0;

                fileToRead2.nextLine();

                while (fileToRead2.hasNext()) {

                    line2 = fileToRead2.nextLine();
                    String[] fields2 = line2.split("\t");
                    // System.out.println(products.get(i) == fields2[1]);

                    if (months.get(i).equals(fields2[4].split("/")[0])) {
                        int qty = Integer.parseInt(fields2[3]);
                        int unitPrice = Integer.parseInt(fields2[2]);
                        total += qty * unitPrice;
                        // System.out.println(total);
                    }
                }
                System.out.println(months.get(i) + " - " + total);
                total = 0;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
