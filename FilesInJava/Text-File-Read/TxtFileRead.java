import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TxtFileRead {
    public static void main(String[] args) {
        try {
            String filePath = "/workspaces/JavaPractice/FilesInJava/Text-File-Read/simple.txt";
            String Line = "";

            File myFile = new File(filePath);
            Scanner fileToRead = new Scanner(myFile);
            while (fileToRead.hasNextLine()) {
                Line = fileToRead.nextLine();
                System.out.println(Line);
            }

            fileToRead.close();

        } catch (FileNotFoundException ff) {
            System.out.println("File not found " + ff);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
