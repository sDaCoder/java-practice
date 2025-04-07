package practice;
import java.io.*;

public class Streaming {
    public static void main(String[] args) {
        System.out.println("Hello");
        
        try(
            FileInputStream sf = new FileInputStream("./file.txt");
            FileOutputStream sf1 = new FileOutputStream("./file1.txt")
        ) 
        {
            // int data;
            // while ((data = sf.read()) != -1) { // Read one byte at a time
            //     sf1.write(data); // Write byte to output file
            // }
            // System.out.println("File copied successfully!");
            byte buffer[] = new byte[1024];
            int bytes;
            while((bytes = sf.read(buffer)) != -1) {
                sf1.write(buffer, 0, bytes);
            }
        }
        catch(IOException e) {
            System.out.println(e);
        } finally {
            System.out.println("Intended to copy file to file1");
        }
    }
}
