import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWrite {
    public static void main(String[] args) {
        String fileName = "sample.txt";

        try {
            // Writing to a file
            FileWriter writer = new FileWriter(fileName);
            writer.write("Hello, Java File I/O!");
            writer.close();
            System.out.println("File write successful.");

            // Reading from a file
            FileReader reader = new FileReader(fileName);
            int data;
            System.out.print("File contents: ");
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
