import java.util.Scanner;

public class Competition {
	public static void main(String[] args) {
		
		Student s[] = new Student[8];
		
		s[0] = new Student("Saifur", "5 August 1995", 11508030, 2014);
		s[1] = new Student("Jahid", "6 July 1996", 11508032, 2014);
		s[2] = new Student("Fahim", "5 January 1995", 13508023, 2013);
		s[3] = new Student("Suman", "5 February 1997", 11508035, 2014);
		s[4] = new Student("Rumana", "5 June 1995", 11508018, 2014);
		s[5] = new Student("Yasmin", "5 July 1996", 11508023, 2014);
		s[6] = new Student("Tanim", "5 November 1995", 11508038, 2014);
		s[7] = new Student("Sabbir", "5 December 1996", 13508033, 2013);
		
		Quiz q[] = new Quiz[5];
		
		q[0] = new Quiz("Which Programming Language is fully OOP ?", "C++", "Java", "C", "Pascal", 2);
		q[1] = new Quiz("Which kind of Inheritance does not support Java ?", "Single", "Multilevel", "Multiple", "Hierarchical", 3);
		q[2] = new Quiz("Who created Python ?", "Guido van Rossum", "Dennis Ritchie", "Balagurusamy", "James Gosling", 1);
		q[3] = new Quiz("What is RISC ?", "a defensive programming style", "a web framework", "a threading library", "a CPU design strategy", 4);
		q[4] = new Quiz("What is the built in library function to compare two strings in c++ ?", "strcmp()", "string_cmp()", "equals()", "str_cmp()", 1);
		
		Candidate c[] = new Candidate[5];
		
		int candidates = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("----Welcome to Quiz Competition----");
			System.out.println("Enter Your Student id to participate ?");
			int id = sc.nextInt();
			if(id == -1){
				break;
			}
			else{
				for(int i = 0; i<8; i++){
					if(id == s[i].get_id()){
						c[candidates] = new Candidate(s[i]);
						
						System.out.println("You may now Proceed");
						
						for(int j = 0; j<5; j++){
							System.out.println("Question No: " +(j+1));
							q[j].display();
							System.out.println("Your answer: ");
							int ans = sc.nextInt();
							if(ans == q[j].get_ans()){
								c[candidates].score();
							}
						}
						
					}
				}	
			
			}
			
			candidates++;
		}
		System.out.println("Candidates Information With Score");
		
		for(int j = 0; j<candidates; j++){
			System.out.println("Candidate No: " +(j+1));
			c[j].display();
		}
		
		sc.close();
				
	}
			
}


