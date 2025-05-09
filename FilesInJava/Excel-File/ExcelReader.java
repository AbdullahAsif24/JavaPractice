
import java.io.FileInputStream;
import java.io.IOException;

public class ExcelReader {
    public static void main(String[] args) {
        String excelFilePath = "/workspaces/JavaPractice/FilesInJava/Excel-File/Exams.xlsx";
        try {

            FileInputStream fis = new FileInputStream(excelFilePath);
            System.out.println(fis);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
