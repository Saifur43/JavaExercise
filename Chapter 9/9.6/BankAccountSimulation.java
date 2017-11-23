import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class BankAccountSimulation {

    public BankAccountSimulation(){
        
    }
    
    public void writeTo(Person person, FileWriter writer){
        
        try {
            writer.write(person.getName()+" ");
            writer.write(person.getAddress()+" ");
            writer.write(person.getAccountNo()+" ");
            writer.write(person.getBalance()+"\r\n");
        } catch (IOException e) {
            System.out.println("File can't be read."+person.getName());
        }
        finally {
            try {
                writer.flush();
            } catch (IOException e) {
                System.out.println("File can't be flushed.");
            }
        }
    }
    
    public void readFrom(FileReader reader){
        Scanner x = new Scanner(reader);
        while(x.hasNext()) {
            String name = x.next();
            String add = x.next();
            int acn = x.nextInt();
            double val = x.nextDouble();
            
            System.out.println("Name: " +name+  " Valance: "+val);
            
        }
        try {
            reader.close();
        } catch (IOException ex) {
            System.out.println("File can't be closed.");
        }
        x.close();
    }
    
    
}

