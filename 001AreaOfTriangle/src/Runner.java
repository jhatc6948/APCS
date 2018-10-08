import javax.swing.JOptionPane;

public class Runner {
	
	/************************
	 * 
	 * Circle: input, calculate circumference, area
	 * Rectangle: input side A,B, calc perimeter, area, diagonal
	 * Triangle: Input sides A, B, C calc perimeter, area, all angles
	 * Cuboid: Input Sides A, B, C, calc volume, total surface area
	 * Sphere: Input radius, calc volume, and surface area
	 * TOTAL celebration dance for tons of great Java that you have learned
	 */

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, " Hello, welcome to Josh Hatch's geometry program");

		Triangle myTriangle = new Triangle();
		Circle myCircle = new Circle();
		Rectangle myRectangle = new Rectangle();
		Cuboid myCuboid = new Cuboid();
		Sphere mySphere = new Sphere();
		

		int goAgain = 1;

		while (goAgain == 1) {
			String msg = "please enter your selection: Triangle, Circle, Rectangle, Cuboid, or Sphere";
			String answer = JOptionPane.showInputDialog(msg);

			JOptionPane.showMessageDialog(null, answer);

			if ((answer.equals("Triangle")) || (answer.equals("triangle"))) {
				JOptionPane.showMessageDialog(null, "We are in Triangle");
				myTriangle.setVarsTOZero();
				myTriangle.setSides();
				myTriangle.calcPerimeter();
				myTriangle.calcArea();
				myTriangle.calcAngles();
				myTriangle.showVars();
			} else if ((answer.equals("Circle")) || (answer.equals("circle"))) {
				JOptionPane.showMessageDialog(null, "We are in Circle");
				myCircle.setVarsTOZero();
				myCircle.setRadius();
				myCircle.calcArea();
				myCircle.calcCircumference();
				myCircle.showVars();
				

			} else if ((answer.equals("Rectangle")) || (answer.equals("rectangle"))) {
				JOptionPane.showMessageDialog(null, "We are in Rectangle");
				myRectangle.setVarsTOZero();
				myRectangle.setSides();
				myRectangle.calcArea();
				myRectangle.calcPerimeter();
				myRectangle.calcDiagonal();
				myRectangle.showVars();
				
			} else if ((answer.equals("Cuboid")) || (answer.equals("cuboid"))) {
				JOptionPane.showMessageDialog(null, "We are in Cuboid");
				myCuboid.setVarsTOZero();
				myCuboid.setSides();
				myCuboid.calcArea();
				myCuboid.calcVolume();
				myCuboid.showVars();
				
			} else if ((answer.equals("Sphere")) || (answer.equals("sphere"))) {
				JOptionPane.showMessageDialog(null, "We are in Sphere");
				mySphere.setVarsTOZero();
				mySphere.setRadius();
				mySphere.calcSurArea();
				mySphere.calcVolume();
				mySphere.showVars();
				
				

			} else {
				JOptionPane.showMessageDialog(null, answer + " What is this?");
			}
			
			msg = "Would you like to go again? (Y/N)";
			answer = JOptionPane.showInputDialog(msg);
			
			JOptionPane.showMessageDialog(null, answer);
			
			if ((answer.equals("Y") || answer.equals("y") || answer.equals("yes") || answer.equals("Yes") )) {
				goAgain = 1;	
			}else {
				goAgain = 0;
				JOptionPane.showMessageDialog(null,"Thank you! Come again!");
			}
		} // end of while

		}// end of main

}// end of runner
