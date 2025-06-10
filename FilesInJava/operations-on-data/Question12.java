// import java.io.File;
// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.Scanner;

// public class Question12 {
//     // QUESTION 12
//     // Write java code that prints all the record sorted in descending order with
//     // respect to sales amount
//     public static void main(String[] args) {
//         try {
//             String myFilePath = "E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt";
//             String line = "";
//             String header = "";
//             String[] fields;
//             List<String[]> records = new ArrayList<>();

//             File myFile = new File(myFilePath);
//             Scanner fileToRead = new Scanner(myFile);

//             header = fileToRead.nextLine();
//             while (fileToRead.hasNext()) {
//                 line = fileToRead.nextLine();
//                 fields = line.split("\t");

//                 records.add(fields);
//             }
//             fileToRead.close();

//             records.sort((a, b)->{
//                 int AmmountA = Integer.parseInt(a[2]);
//                 int qtyA = Integer.parseInt(a[3]);
//                 int sellPriceA = AmmountA*qtyA;
                
//                 int AmmountB = Integer.parseInt(b[2]);
//                 int qtyB = Integer.parseInt(b[3]);
//                 int sellPriceB = AmmountB*qtyB;

//                 return Integer.compare(sellPriceB, sellPriceA);
//             });

//             System.out.println(header);

//             for (int i = 0; i < records.size(); i++) {
//                 String[] record = records.get(i);
//                 System.out.println(String.join("\t", record));
//             }

//         } catch (Exception e) {
//             System.out.println(e);
//         }

//     }

// }


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Question12 {
    public static void main(String[] args) {
        File file = new File("E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\operations-on-data\\sampleForQuizExam.txt");

        String[][] records = new String[100][6]; // up to 100 records, 6 fields each
        int[] salesAmount = new int[100];

        int count = 0; // total number of records read

        try {
            Scanner sc = new Scanner(file);

            // Skip header
            if (sc.hasNextLine()) {
                sc.nextLine();
            }

            while (sc.hasNextLine() && count < 100) {
                String line = sc.nextLine();
                String[] fields = line.split("\t");

                // this condition and loop use to store the values in record i represents column
                if (fields.length == 6) {
                    for (int i = 0; i < 6; i++) {
                        records[count][i] = fields[i];
                    }

                    int unitPrice = Integer.parseInt(fields[2]);
                    int quantity = Integer.parseInt(fields[3]);
                    salesAmount[count] = unitPrice * quantity;

                    count++;
                }
            }

            sc.close();
        } 
        
        catch (IOException e) {
            System.out.println("Error reading file.");
        }
        
        // Bubble sort based on salesAmount (descending) and the first 2 conditions are learn asitise
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - i - 1; j++) {
                if (salesAmount[j] < salesAmount[j + 1]) {
                    // Swap amounts
                    int tempAmount = salesAmount[j];
                    salesAmount[j] = salesAmount[j + 1];
                    salesAmount[j + 1] = tempAmount;

                    // Swap corresponding records
                    String[] tempRecord = records[j];
                    records[j] = records[j + 1];
                    records[j + 1] = tempRecord;
                }
            }
        }

        // Print sorted records i represents row
        System.out.println("Records sorted by sales amount (descending):");
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(records[i][j] + "\t");
            }
            System.out.println("Amount: " + salesAmount[i]);
        }
    }
}