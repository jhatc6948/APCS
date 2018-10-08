import javax.swing.JOptionPane;

public class Sphere {
	private double radius;
	private double volume;
	private double SurArea;
	private double rad3;
	
	public Sphere() {
	}

	// methods go here
	public void setVarsTOZero() {

		radius = 0.0;
		volume = 0.0;
		SurArea = 0.0;
		rad3 = 0.0;
	}
	public void showVars() {
		String msg = "radius = " + radius + " " +rad3 + " ; volume = " + volume + " ; surface area = " + SurArea;
		JOptionPane.showMessageDialog(null, msg);
	}
	public void setRadius() {
		//System.out.println("enter value for side A ");
		//sideA = keyboard.nextDouble();
		radius = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for the radius: "));
	}	
	public void calcVolume() {
		rad3 = (radius * radius) *radius;
		volume = (1.333333 * rad3) * 3.14; 
		

	}

	public void calcSurArea() {
		SurArea = ((radius * radius) * 4) * 3.14;
	}
}



