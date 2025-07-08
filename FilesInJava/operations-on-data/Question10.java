import java.io.File;
import java.util.Scanner;

public class Question10 {
    // Q10) Write code that asks the user for an itemCode and prints the total of
    // the
    // quantity of that item purchased by any of the customer.
    public static void main() {
        try {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter Item code to find Quantity of that item");
            String inpItemCode = myObj.nextLine();
            myObj.close();

            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            String[] fields;
            int qty = 0;

            //  Scanner fileToRead = new Scanner(new File("E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt"));
            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);

            while (fileToRead.hasNext()) {
                line = fileToRead.nextLine();
                fields = line.split("\t");

                if (inpItemCode.equals(fields[0])) {
                    qty += Integer.parseInt(fields[3]);
                }
            }

            

            System.out.println(qty);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }

}
