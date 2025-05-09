import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class EXCFileRead {
    public static void main(String[] args) {
        String filePath = "/workspaces/JavaPractice/FilesInJava/Excel-File/Exams.txt";
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("❌ File not found at: " + filePath);
            return;
        }

        System.out.println("✅ File found. Reading content...\n");

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            boolean isEmpty = true;

            while ((line = br.readLine()) != null) {
                line = line.trim();
                if (!line.isEmpty()) {
                    isEmpty = false;
                    String[] values = line.split("\t"); // tab-separated
                    for (String value : values) {
                        System.out.print(value + " | ");
                    }
                    System.out.println();
                }
            }

            if (isEmpty) {
                System.out.println("⚠️ File was empty or had only whitespace.");
            }

        } catch (IOException e) {
            System.out.println("❗ Error reading file: " + e.getMessage());
        }
    }
}
