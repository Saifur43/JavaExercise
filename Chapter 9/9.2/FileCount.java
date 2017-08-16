import java.io.File;

public class FileCount {

	public static void main(String[] args){
		
        File dir = new File("src/Files");
		File[] home = dir.listFiles();
		int count = 0;
		
        for (File files : home) {
                if (files.isFile()) {
                	System.out.println("File " + files.getName());
                    count++;
                }
        }
        System.out.println("Number of files: " + count);
		
		
		
		
		
		
		
		

	}

}
