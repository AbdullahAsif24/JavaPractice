import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class operations {

    // function to calculate total sell ammount
    public static double calculateTotalPrice() {
        double totalPrice = 0;
        try {

            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);
            line = fileToRead.nextLine();
            while (fileToRead.hasNextLine()) {
                line = fileToRead.nextLine();
                String[] data = line.split("\t");
                totalPrice += (Double.parseDouble(data[2]) * Double.parseDouble(data[3]));
            }
        } catch (FileNotFoundException nf) {
            System.out.println("file not found" + nf);
        } catch (Exception e) {
            System.err.println(e);
        }
        return totalPrice;
    }

    // function to caculate total sell ammount of each representative
    public static void repSellAmmount() {
        try {
            String filePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            int total = 0;

            File myFile = new File(filePath);
            Scanner fileToRead = new Scanner(myFile);

            fileToRead.nextLine();

            line = fileToRead.nextLine();
            String[] fields = line.split("\t");
            String empId = fields[5];
            while (fileToRead.hasNext()) {
                while (fields[5].compareTo(empId) == 0) {
                    int qty = Integer.parseInt(fields[3]);
                    int unitPrice = Integer.parseInt(fields[2]);
                    total += qty * unitPrice;

                    if (!(fileToRead.hasNextLine())) {
                        break;
                    }
                    line = fileToRead.nextLine();
                    fields = line.split("\t");
                }
                System.out.println(empId + " - " + total);
                empId = fields[5];
                total = 0;
            }

        } catch (Exception e) {
            System.err.println(e);
        }
    }

    // function to total sell ammount for every product
    public static void prodSellAmmount() {
        try {
            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";

            File myFile = new File(myFilePath);
            Scanner fileToRead = new Scanner(myFile);

            line = fileToRead.nextLine();

            line = fileToRead.nextLine();
            String[] fields = line.split("\t");
            ArrayList<String> products = new ArrayList<>();
            products.add(fields[1]);

            while (fileToRead.hasNext()) {
                if (products.contains(fields[1])) {
                    line = fileToRead.nextLine();
                    fields = line.split("\t");
                } else {
                    products.add(fields[1]);

                    line = fileToRead.nextLine();
                    fields = line.split("\t");
                }

            }
            System.out.println(products);

            fileToRead.close();

            for (int i = 0; i < products.size(); i++) {
                File myFile2 = new File(myFilePath);
                Scanner fileToRead2 = new Scanner(myFile2);
                String line2 = "";
                int total = 0;

                fileToRead2.nextLine();

                while (fileToRead2.hasNext()) {

                    line2 = fileToRead2.nextLine();
                    String[] fields2 = line2.split("\t");
                    // System.out.println(products.get(i) == fields2[1]);

                    if (products.get(i).equals(fields2[1])) {
                        int qty = Integer.parseInt(fields2[3]);
                        int unitPrice = Integer.parseInt(fields2[2]);
                        total += qty * unitPrice;
                        // System.out.println(total);
                    }
                }
                System.out.println(products.get(i) + " - " + total);
                total = 0;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    // Q10) Write code that asks the user for an itemCode and prints the total of
    // the
    // quantity of that item purchased by any of the customer.
    public static void QuantityOfInputItem() {
        try {
            Scanner myObj = new Scanner(System.in);

            System.out.println("Enter Item code to find Quantity of that item");
            String inpItemCode = myObj.nextLine();
            myObj.close();

            String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
            String line = "";
            String[] fields;
            int qty = 0;

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

    // QUESTION 11:
    // Write java code to display monthwise sales
    // function to total sell ammount for every product
    public static void MonthSellAmmount() {
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

    // QUESTION 12
    // Write java code that prints all the record sorted in descending order with
    // respect to sales amount
    public static void SortBySellAmmountDesc() {
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

    public static void main(String[] args) {
        // double totalAmmount = calculateTotalPrice();
        // System.out.println(totalAmmount);

        // repSellAmmount();

        // prodSellAmmount();

        // QuantityOfInputItem();

        // MonthSellAmmount();

        SortBySellAmmountDesc();
    }
}