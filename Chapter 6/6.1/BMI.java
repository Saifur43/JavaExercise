
public class BMI {
	
	public static final double KG_P_P = 0.45359237;
	public static final double M_P_I = 0.0254;
	
	private String name;
	private double weight;
	private double height;
	
	public BMI(String name, double weight, double height){
		this.name = name;
		this.weight = weight;
		this.height = height;
		
	}
	
	public double getBMI(){
		double bmi;
		bmi = (weight * KG_P_P) / ((height * M_P_I) * (height * M_P_I));	
		return bmi;
	}
	
	public String getStatus(){
		double bmi = getBMI();
		if(bmi < 18.5){
			return "Underweight";
		}
		else if(bmi >=18.5 && bmi < 25){
			return "Normal";
		}
		else if(bmi >=25 && bmi < 29.9){
			return "Overweight";
		}
		else{
			return "Obesity";
		}
		
	}
	
	public String getName(){
		return name;
	}
	
}
