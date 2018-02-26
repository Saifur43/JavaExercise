import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class ResultProcess {
	
	void fileWrite(Student student, FileWriter writer){
        try {
            writer.write(student.getName()+" ");
            writer.write(student.getRoll()+" ");
            writer.write(student.getCourse1()+" ");
            writer.write(student.getMark1()+" ");
            writer.write(student.getCourse2()+" ");
            writer.write(student.getMark1()+" ");
            writer.write(student.getCourse3()+" ");
            writer.write(student.getMark2()+"\r\n");

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
            String roll = sc.next();
            String c1 = sc.next();
            double mark1 = sc.nextDouble();
            String c2 = sc.next();
            double mark2 = sc.nextDouble();
            String c3 = sc.next();
            double mark3 = sc.nextDouble();
            
            double result = (mark1 + mark2 + mark3)/3;
            
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
                rWriter.write(roll+" ");
                rWriter.write(result+"\r\n");

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
            
            
            
            //System.out.println(name);
            //System.out.println("Roll: "+roll);
            //System.out.println("Result: "+result);
            
            
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
