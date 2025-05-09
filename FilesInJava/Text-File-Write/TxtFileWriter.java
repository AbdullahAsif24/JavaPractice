import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileWriter {
    public static void main(String[] args) {
        String filePath = "/workspaces/JavaPractice/FilesInJava/Text-File-Write/simple.txt";
        File myFile = new File(filePath);
        try {
            if (myFile.exists()) {
                FileWriter myWriter = new FileWriter(filePath);
                myWriter.write("Files in Java might be tricky, but it is fun enough!");
                myWriter.close();
                System.out.println("File Write Successfully");
            }else {
                System.out.println("File not found");
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
