import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class BankTest {
	
public static void main(String[] args) {
        
        FileWriter writer = null;
        try{
            writer = new FileWriter("AcInformation.txt",true);
        } catch(FileNotFoundException e){
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("File can't be read.");
        }
        FileReader reader = null;
        try {
            reader = new FileReader("AcInformation.txt");
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        BankAccountSimulation b = new BankAccountSimulation();
        b.writeTo(new Person("Saifur","Sylhet", 22343, 2000.00), writer);
        b.writeTo(new Person("Fahim","Comilla", 41342, 3000.00), writer);
        
        b.readFrom(reader);
        
    }
    

}
