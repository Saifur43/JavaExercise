import java.text.DecimalFormat;

public class AreaCalculator {
	
	public static final double pi = 3.1436;
	
	public static void main(String args[]){
		DecimalFormat df = new DecimalFormat("#.###");
		
		AreaCalculator circle = new AreaCalculator();
		System.out.println("The Area of cricle "+ df.format(circle.getArea(3.2)) + "m\u00B2");
		
		AreaCalculator triangle = new AreaCalculator();
		System.out.println("The Area of tringle "+ df.format(triangle.getArea(4.2, 5)) + "m\u00B2");
		
		AreaCalculator rectangle = new AreaCalculator();
		System.out.println("The Area of rectangle "+ df.format(rectangle.getArea(5, 7)) + "m\u00B2");
		
		AreaCalculator cylinder = new AreaCalculator();
		System.out.println("The Area of cylinder "+ df.format(cylinder.getArea(3.2, 4.3)) + "m\u00B2");
		
		
		
	}
	
	public double getArea(double radius){
		return ((radius * radius) * pi);
	}
	
	public double getArea(int lenght, int width){
		return (lenght*width);
	}
	
	public double getArea(double base, int height){
		return (0.5 * (base* height));
	}
	
	public double getArea(double radius, double height){
		return ((2* pi * (radius * radius)) * (height * (2 * pi * radius)));
	}

}
