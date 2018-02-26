import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class AccomodationTest {

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
        
        AccomodationProcess rp = new AccomodationProcess();
        
        rp.fileWrite(new Student("Saifur","Comilla", "0177834232"), writer);
        rp.fileWrite(new Student("Jihad","TTYUT", "0177834276"), writer);
        rp.fileWrite(new Student("Mosiur","Sylhet", "01776554232"), writer);

        
        rp.resultProcess(reader);
        
        
        JFrame jf = new JFrame();
    	JPanel jp = new JPanel();
    	JLabel jl = new JLabel();
    	JTextField jt = new JTextField("Enter Name",20);
    	//jt.setBounds(50,50,150,20);
    	JTextField tf2 = new JTextField();
        tf2.setBounds(280,100, 250,20);  
        JButton b=new JButton("Get Information");  
        b.setBounds(300,50,195,30);  
        
        jf.setTitle("Accomodation Process");
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
		            reader1 = new FileReader("Information.txt");
		        }
		        catch (FileNotFoundException e1) {
		            System.out.println("File not found.");
		        }
		        
		        Scanner sc1 = new Scanner(reader1);

		        String fadd = "";
		        String fpn = "";
		        int c = 0;
		        while(sc1.hasNext()) {
		        	String name = sc1.next();
		        	String add = sc1.next();
		        	String pn = sc1.next();
		        	System.out.println(input);
		        	System.out.println(add);
		        	
		        	if(name.equals(input)){
		        		c = 1;
		        		fadd = add;
		        		
		        		fpn = pn;
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
		        	tf2.setText("Address: "+fadd+" PN: "+fpn);
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
