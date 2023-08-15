import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "example.txt";
        
        // Write to the file
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write("Hello, World!\n");
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        // Read from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Reading from the file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading from the file.");
            e.printStackTrace();
        }

        // Append to the file
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.append("This is an appended line.\n");
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while appending to the file.");
            e.printStackTrace();
        }
    }
}
