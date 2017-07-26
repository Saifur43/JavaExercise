import java.util.Scanner;


public class ATM {
	private int ac_no;
	private String pass;
	private double balance;
	
	Scanner sc = new Scanner(System.in);
	
	public ATM(int ac_no, String pass){
		this.ac_no = ac_no;
		this.pass = pass;
		balance = 0;
	}
	
	public void check_bl(){
		System.out.println("Balance: " + balance);
	}
	
	public void withdraw(){
		System.out.println("Enter withdraw amount: ");
		double amount = sc.nextDouble();	
		balance = balance - amount;
		
		System.out.print("Remaining ");
		check_bl();
		
	}
	
	public void deposit(){
		System.out.println("Enter Deposit amount: ");
		double amount = sc.nextDouble();	
		balance = balance + amount;
		
		System.out.print("New ");
		check_bl();
		
	}
	
	public int get_ac_no(){
		return ac_no;
	}
	
	public String get_pass(){
		return pass;
	}
	

}
