
public class BMITest {

	public static void main(String[] args) {
		
		BMI bmi = new BMI("Saifru", 145, 70);
		System.out.println("The BMI for " + bmi.getName() + "is ( " + bmi.getBMI() + " ) " + bmi.getStatus());

	}

}
