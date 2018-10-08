import javax.swing.JOptionPane;

public class Triangle {

	// class variables go here
	private double sideA, sideB, sideC;
	private double perimeter;
	private double theArea;

	// constructor goes here
	public Triangle() {
	}

	// methods go here
	public void setVarsTOZero() {

		sideA = 0.0;
		sideB = 0.0;
		sideC = 0.0;
		perimeter = 0.0;
		theArea = 0.0;
	}

	public void showVars() {
		
		String msg = "Side A, B, C = " + sideA + ", "+ sideB + ", " + sideC 
				+ "; perimeter: " + perimeter 
				+ "; area = " + theArea;
		JOptionPane.showMessageDialog(null, msg);
	}

	public void setSides() {
		//System.out.println("enter value for side A ");
		//sideA = keyboard.nextDouble();
		sideA = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side A: "));
		
		
		//System.out.println("enter value for side B ");
		//sideB = keyboard.nextDouble();
		sideB = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side B: "));
		
		//System.out.println("enter value for side C ");
		//sideC = keyboard.nextDouble();
		sideC = Double.parseDouble(JOptionPane.showInputDialog("Please enter the value for side C: "));

	}

	public void calcPerimeter() {
		perimeter = sideA + sideB + sideC;

	}

	public void calcArea() {
		double p = 0.0;
		p = (sideA + sideB + sideC) / 2.0;

		theArea = Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));

	}

	public void calcAngles() {
		double cosA = 0.0, Acos = 0.0, Adeg = 0.0;
		double cosB = 0.0, Bcos = 0.0, Bdeg = 0.0;
		double cosC = 0.0, Ccos = 0.0, Cdeg = 0.0;

		cosA = (Math.pow(sideB, 2.0) + Math.pow(sideC, 2.0) - Math.pow(sideA, 2.0)) / (2.0 * sideB * sideC);
		//System.out.println("cosA = " + cosA);
		//JOptionPane.showMessageDialog(null, " cosA = " + cosA + "; arcCos = " + Acos + "; angle of A = " + Adeg);
		Acos = Math.acos(cosA);
		//System.out.println("arcCos = " + Acos);
		//JOptionPane.showMessageDialog(null,"arcCos = " + Acos);
		Adeg = Math.toDegrees(Acos);
		//System.out.println("angle of A = " + Adeg);
		//JOptionPane.showMessageDialog(null, "angle of A = " + Adeg);
		
		cosB = (Math.pow(sideC, 2.0) + Math.pow(sideA, 2.0) - Math.pow(sideB, 2.0)) / (2.0 * sideC * sideA);
		//System.out.println("cosB = " + cosB);
		//JOptionPane.showMessageDialog(null, " cosB = " + cosB + "; arcCos = " + Bcos + "; angle of B = " + Bdeg);
		Bcos = Math.acos(cosB);
		//System.out.println("arcCos = " + Bcos);
		//JOptionPane.showMessageDialog(null, "arcCos = " + Bcos);
		Bdeg = Math.toDegrees(Bcos);
		//System.out.println("angle of B = " + Bdeg);
		//JOptionPane.showMessageDialog(null, "angle of B = " + Bdeg);
		
		
		cosC = (Math.pow(sideA, 2.0) + Math.pow(sideB, 2.0) - Math.pow(sideC, 2.0)) / (2.0 * sideA * sideB);
		//System.out.println("cosC = " + cosC);
		//JOptionPane.showMessageDialog(null, " cosC = " + cosC + "; arcCos = " + Ccos + "; angle of Cdeg" + Cdeg);
		Ccos = Math.acos(cosC);
		//System.out.println("arcCos = " + Ccos);
		//JOptionPane.showMessageDialog(null, " arcCos = " + Ccos);
		Cdeg = Math.toDegrees(Ccos);
		//System.out.println("angle of C = " + Cdeg);
		//JOptionPane.showMessageDialog(null, "angle of Cdeg" + Cdeg);
		JOptionPane.showMessageDialog(null, " angle of A = " + Adeg + "; angle of B = " + Bdeg + "; angle of C" + Cdeg);
	}

}
