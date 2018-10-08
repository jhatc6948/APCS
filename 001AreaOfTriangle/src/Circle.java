import javax.swing.JOptionPane;

public class Circle {
	private double radius;
	private double circum;
	private double area;
	
	public Circle() {
	}

	// methods go here
	public void setVarsTOZero() {

		radius = 0.0;
		circum = 0.0;
		area = 0.0;
	}
	public void showVars() {
		
		String msg = "radius = " + radius + " ; circumference = " + circum + " ; area = " + area;
		JOptionPane.showMessageDialog(null, msg);
	}
	public void setRadius() {
		//System.out.println("enter value for side A ");
		//sideA = keyboard.nextDouble();
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for the radius: "));
	}	
	public void calcCircumference() {
		circum = radius * 3.14 * 2 ;

	}

	public void calcArea() {
		area = radius * radius * 3.14;
	}
}
