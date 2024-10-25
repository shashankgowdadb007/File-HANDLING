import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteTextFile {
    public static void main(String[] args) {
        String filePath = "path/to/your/outputfile.txt"; // Specify the output file path
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            bw.write("Hello, this is a text file.");
            bw.newLine();
            bw.write("This line is written to the file.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
