import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileRead {

	public static void main(String[] args) throws IOException {
		FileWriter writer = null;
        try{
            writer = new FileWriter("File.txt",true);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("File can't be read.");
        }
        
        FileWriter writer2 = null;
        try{
            writer2 = new FileWriter("Output.txt",true);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("File can't be read.");
        }
        
        FileReader reader = null;
        try {
            reader = new FileReader("File.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        
        try {
            writer.write(input);
            

        } 
        catch (IOException e) {
            System.out.println("File can't be read.");
        }
        finally {
            try {
                writer.flush();
            } catch (IOException e) {
                System.out.println("File can't be flushed.");
            }
        }
        
        int x;
        try{
            while((x = reader.read())!=-1){
               writer2.write((char)x);
            }
            
        }
        catch (IOException e) {
            System.out.println("File can't be read.");
        }
        finally{
            reader.close();
            writer2.flush();
        }
        sc.close();
	}

}