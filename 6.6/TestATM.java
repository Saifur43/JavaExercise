import java.util.Scanner;


public class TestATM {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ATM user[] = new ATM[5];
		
		user[0] = new ATM(11508030, "Saifur43");
		user[1] = new ATM(11508031, "Jahid23");
		user[2] = new ATM(11508032, "Fahim34");
		user[3] = new ATM(11508033, "Jihad42");
		user[4] = new ATM(11508034, "Sabbir332");
		
		
		System.out.println("Enter your account no: ");
		int ac = sc.nextInt();
		
		int flag = 0;
		int u = -1;
		for(int i=0; i<5; i++){
			if(ac == user[i].get_ac_no()){
				flag = 1;
				u = i;
			}
		}
		if(flag == 1){
			System.out.println("Enter your password: ");
			String pass = sc.next();

			if(pass.equals(user[u].get_pass())){
				System.out.println("Login succesfull.");
				while(true){
					System.out.println("1. Check Balance");
					System.out.println("2. Withdraw");
					System.out.println("3. Deposit");
					System.out.println("4. Exit");
					System.out.println("Enter Choice: ");
					
					int c = sc.nextInt();
					if(c == 1){
						user[u].check_bl();
					}
						
					else if(c == 2){
						user[u].withdraw();
					}
						
					else if(c == 3){
						user[u].deposit();
					}
						
					else if(c == 4){
						break;
					}
				}
		
			}
			else{
				System.out.println("Invalid password");
			}
		}
		else{
			System.out.println("Invalid user");
		}
		
		System.out.println("Thank You");
		sc.close();
	}
}
		
