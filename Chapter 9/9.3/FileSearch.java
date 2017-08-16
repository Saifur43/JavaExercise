import java.io.File;
import java.util.Scanner;


public class FileSearch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter File Name: ");
		 String fName = sc.next();
		 
		 int flag = 0;
		 
			
		 File dir = new File("src/Files");
		 File[] home = dir.listFiles();
			
		 for (File files : home){
			 String name = files.getName();
			 if(name.equals(fName)){
				 flag = 1;
			 }
	        	
		 }
		 if(flag == 1){
			 System.out.println("File exists !");
		 }
		 else{
			 System.out.println("Not exists !");
		 }
		 sc.close();
	
	}

}
