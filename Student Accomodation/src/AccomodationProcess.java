import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class AccomodationProcess {
	
	void fileWrite(Student student, FileWriter writer){
        try {
            writer.write(student.getName()+" ");
            writer.write(student.getAdd()+" ");
            writer.write(student.getPN()+"\r\n");

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
	}
	
	
void resultProcess(FileReader reader){
        
        Scanner sc = new Scanner(reader);
        while(sc.hasNext()) {
        	
        	String name = sc.next();
            String add = sc.next();
            String pn = sc.next();
            
            FileWriter rWriter = null;
            try{
                rWriter = new FileWriter("Result.txt",true);
            }
            catch(FileNotFoundException e){
                System.out.println("File not found.");
            }
            catch (IOException e) {
                System.out.println("File can't be read.");
            }
            
            try {
                rWriter.write(name+" ");
                rWriter.write(add+" ");
                rWriter.write(pn+"\r\n");

            } 
            catch (IOException e) {
                System.out.println("File can't be read.");
            }
            finally {
                try {
                    rWriter.flush();
                } catch (IOException e) {
                    System.out.println("File can't be flushed.");
                }
            }
            
            
            
            System.out.println(name);

            
            
        }
        try {
            reader.close();
        } 
        catch (IOException ex) {
            System.out.println("File can't be closed.");
        }
        sc.close();
        
    }



}
