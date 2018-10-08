import javax.swing.JOptionPane;

public class Rectangle {
	private double sideA, sideB;
	private double perimeter;
	private double theArea;
	private double diag;
	
	public Rectangle() {
	}


	public void setVarsTOZero() {
	
		sideA = 0.0;
		sideB = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
		diag = 0.0;
	}
	
	public void showVars() {
		
		String msg = "Sides A and B = " + sideA + ", "+ sideB 
				+ "; perimeter: " + perimeter 
				+ "; area = " + theArea + "; diagonal = " + diag;
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));
	}
	
	public void calcPerimeter() {
		perimeter = (sideA + sideB) * 2;
	
	}
	
	public void calcArea() {
		theArea = sideA * sideB;
		
	}
	
	
	public void calcDiagonal() {
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		side1 = (sideA * sideA);
		side2 = (sideB * sideB);
		side3 = (side1 + side2);
		diag = Math.sqrt(side3);
	}
	}
