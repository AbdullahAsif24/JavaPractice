
import java.io.BufferedReader;
import java.io.FileReader;

public class prQues1 {
    public static void main(String[] args) {
        try {

            //Q) Given a file where each line contains two values separated by a space: the first value is a
                //number, the second is an index. Read each line, split it into two parts, and store the number at
                //the given index in an array called initialNumber. Both values should be converted to integers
                //using Integer.parseInt. After storing all values, print the array
            BufferedReader br = new BufferedReader(new FileReader("E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\PracticeQuestions\\prQues1.txt"));
            String line;
            String[] fields;
            int maxIndex = 0;

            // to check max index
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(" ");
                int index = Integer.parseInt(parts[1]);
                if (index > maxIndex) {
                    maxIndex = index;
                }
            }
            int[] initialNumber = new int[maxIndex+1];

            br.close();

            // to store numbers in initialNumber array
            BufferedReader br2 = new BufferedReader(new FileReader("E:\\UBIT\\programming fundamentals 1st sem\\java\\JavaPractice\\FilesInJava\\PracticeQuestions\\prQues1.txt"));
            while ((line = br2.readLine()) != null) {
                fields = line.split(" ");
                int number = Integer.parseInt(fields[0]);
                int index = Integer.parseInt(fields[1]);
                initialNumber[index] = number;
            }

            for (int i = 0; i < initialNumber.length; i++) {
                System.out.println(initialNumber[i]);
            }

            br2.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
