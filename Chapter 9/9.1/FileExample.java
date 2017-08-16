import java.util.*;
import java.io.*;

public class FileExample {

	public static void main(String[]  args) throws FileNotFoundException{
		
		Scanner in = new Scanner(new File("saifur.txt"));
		
        int words = 0;
        int lines = 0;
        int chars = 0;
         
        while(in.hasNextLine()) {
        	 
            lines++;
            String line = in.nextLine();
            chars += line.length();
            words += new StringTokenizer(line, " ,").countTokens();
         }

         System.out.println("Number of lines: " + lines);
         System.out.println("Number of words: " + words);
         System.out.println("Number of characters: " + chars);
         
         in.close();

	}

}
