import javax.swing.JOptionPane;

public class Cuboid {
	private double sideA, sideB, sideC;
	private double surArea;
	private double theVolume;
	
	public Cuboid() {
	}


	public void setVarsTOZero() {
	
		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		surArea = 0.0;
		theVolume = 0.0;
	}
	
	public void showVars() {
		
		String msg = "Sides A, B, C = " + sideA + ", "+ sideB  + ", " + sideC
				+ "; surface area: " + surArea 
				+ "; Volume = " + theVolume; 
		JOptionPane.showMessageDialog(null, msg);
	}
	
	public void setSides() {
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A (length): "));
		
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B (width) : "));
		
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C (height) : "));
	}
	
	public void calcArea() {
		double side1 = 0.0;
		double side2 = 0.0;
		double side3 = 0.0;
		side1 = sideA * sideB * 2;
		side2 = sideA * sideC * 2;
		side3 = sideB * sideC * 2;
		surArea = side1 + side2 + side3;
	
	}
	
	public void calcVolume() {
		theVolume = sideA * sideB * sideC;
		
	}

}
