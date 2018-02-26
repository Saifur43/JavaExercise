import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.*;


public class ResultTest{

	public static void main(String[] args) {
		
		FileWriter writer = null;
        try{
            writer = new FileWriter("StudentInformation.txt",true);
        }
        catch(FileNotFoundException e){
            System.out.println("File not found.");
        }
        catch (IOException e) {
            System.out.println("File can't be read.");
        }
        
        FileReader reader = null;
        try {
            reader = new FileReader("StudentInformation.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
        
        ResultProcess rp = new ResultProcess();
        
        rp.fileWrite(new Student("Saifur", "11508030", "Java", 3.75, "Economics", 3.00, "Algorithm", 3.50), writer);

        rp.fileWrite(new Student("Jahid", "11508048", "Java", 3.25, "Economics", 3.50, "Algorithm", 3.00), writer);

        rp.fileWrite(new Student("Fahim", "11508024", "Java", 3.50, "Economics", 4.00, "Algorithm", 3.25), writer);
        rp.resultProcess(reader);
        
        JFrame jf = new JFrame();
    	JPanel jp = new JPanel();
    	JLabel jl = new JLabel();
    	JTextField jt = new JTextField("Enter Roll",20);
    	//jt.setBounds(50,50,150,20);
    	JTextField tf2 = new JTextField();
        tf2.setBounds(280,100, 150,20);  
        JButton b=new JButton("Result");  
        b.setBounds(300,50,95,30);  
        
        jf.setTitle("Result Processing");
        jf.setVisible(true);
        jf.setSize(800,400);
        
        jp.add(jt);
        
        b.addActionListener(new ActionListener()
        {
			@Override
			public void actionPerformed(ActionEvent e) {
				String input = jt.getText();
				
				
				FileReader reader1 = null;
		        try {
		            reader1 = new FileReader("Result.txt");
		        }
		        catch (FileNotFoundException e1) {
		            System.out.println("File not found.");
		        }
		        
		        Scanner sc1 = new Scanner(reader1);
		        int c = 0;
		        String fname = "";
		        double fresult = 0;
		        while(sc1.hasNext()) {
		        	String name = sc1.next();
		        	String roll = sc1.next();
		        	double result = sc1.nextDouble();
		        	System.out.println(input);
		        	System.out.println(roll);
		        	
		        	if(roll.equals(input)){
		        		c = 1;
		        		fname = name;
		        		
		        		fresult = result;
		        	}
		        }
		        
		        try {
		            reader1.close();
		        } 
		        catch (IOException ex) {
		            System.out.println("File can't be closed.");
		        }
		        sc1.close();
		        
		        if(c == 1){
		        	tf2.setText("Name: "+fname+" Result: "+fresult);
		        }
		        else{
		        	tf2.setText("Result Not Found");
		        }
				
			}
        });
        
        
        jf.add(b);
        jp.add(tf2);
        jf.add(tf2);
        jp.add(jl);
        
        jf.add(jp);
        
        
        

	}

}
