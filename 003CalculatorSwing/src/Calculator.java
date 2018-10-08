import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

	public class Calculator implements ActionListener {
		
		// Class vars aka instance variables aka field variables
		JFrame frame;
		JTextField textField;
		// Buttons 0 through 9, add, subtract, multiply, divide,
		// Equals, clear, backspace.
		JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdec, badd, bsub,
		bmul, bdiv, bclr, bksp, bsqr, bcbe, bsqt, blog, beq;
		
		double firstNumber;
		double secondNumber;
		double result;
		int operator;
		
		// Constructor
		public Calculator() {
			frame = new JFrame("Calculator, Created by Josh Hatch");
			frame.setLayout(null);
			
			textField = new JTextField();
			textField.setBounds(30, 40, 410, 30);
			frame.add(textField);
			
			b1 = new JButton("1");
			b1.setBounds(40, 340, 50, 40);
			frame.add(b1);
			
			b4 = new JButton("4");
			b4.setBounds(40, 270, 50, 40);
			frame.add(b4);
			
			b7 = new JButton("7");
			b7.setBounds(40, 200, 50, 40);
			frame.add(b7);
			
			b0 = new JButton("0");
			b0.setBounds(40, 410, 120, 40);
			frame.add(b0);

			b2 = new JButton("2");
			b2.setBounds(110, 340, 50, 40);
			frame.add(b2);
			
			b5 = new JButton("5");
			b5.setBounds(110, 270, 50, 40);
			frame.add(b5);
			
			b8 = new JButton("8");
			b8.setBounds(110, 200, 50, 40);
			frame.add(b8);
			
			b3 = new JButton("3");
			b3.setBounds(180, 340, 50, 40);
			frame.add(b3);
			
			b6 = new JButton("6");
			b6.setBounds(180, 270, 50, 40);
			frame.add(b6);
			
			b9 = new JButton("9");
			b9.setBounds(180, 200, 50, 40);
			frame.add(b9);
			
			bsub = new JButton("-");
			bsub.setBounds(250, 130, 50, 40);
			frame.add(bsub);
			
			badd = new JButton("+");
			badd.setBounds(250, 200, 50, 110);
			frame.add(badd);
			
			bdec = new JButton(".");
			bdec.setBounds(180, 410, 50, 40);
			frame.add(bdec);
			//
			bmul = new JButton("*");
			bmul.setBounds(180, 130, 50, 40);
			frame.add(bmul);
			
			bdiv = new JButton("/");
			bdiv.setBounds(110, 130, 50, 40);
			frame.add(bdiv);
			
			bclr = new JButton("C");
			bclr.setBounds(40, 130, 50, 40);
			frame.add(bclr);
			
			beq = new JButton("=");
			beq.setBounds(250, 340, 50, 110);
			frame.add(beq);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setResizable(false);
			frame.setSize(600, 500);
			frame.setVisible(true);
			
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
			b4.addActionListener(this);
			b5.addActionListener(this);
			b6.addActionListener(this);
			b7.addActionListener(this);
			b8.addActionListener(this);
			b9.addActionListener(this);
			bdec.addActionListener(this);
			b0.addActionListener(this);
			badd.addActionListener(this);
			bsub.addActionListener(this);
			bmul.addActionListener(this);
			bdiv.addActionListener(this);
			bclr.addActionListener(this);
			beq.addActionListener(this);
			
			
		}

		// Listener -- waiting for an event, mouse click, mouse over...
		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == b1)
				textField.setText(textField.getText().concat("1"));
			if(e.getSource() == b2)
				textField.setText(textField.getText().concat("2"));
			if(e.getSource() == b3)
				textField.setText(textField.getText().concat("3"));
			if(e.getSource() == b4)
				textField.setText(textField.getText().concat("4"));
			if(e.getSource() == b5)
				textField.setText(textField.getText().concat("5"));
			if(e.getSource() == b6)
				textField.setText(textField.getText().concat("6"));
			if(e.getSource() == b7)
				textField.setText(textField.getText().concat("7"));
			if(e.getSource() == b8)
				textField.setText(textField.getText().concat("8"));
			if(e.getSource() == b9)
				textField.setText(textField.getText().concat("9"));
			if(e.getSource() == bdec)
				textField.setText(textField.getText().concat("."));
			if(e.getSource() == b0)
				textField.setText(textField.getText().concat("0"));
			if(e.getSource() == bdiv)
				textField.setText(textField.getText().concat("9"));
			if(e.getSource() == bmul)
				textField.setText(textField.getText().concat("."));
			if(e.getSource() == bclr) {
				textField.setText("");
			}
				

			
			if(e.getSource() == badd) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 1;
				textField.setText("");
			}
			if(e.getSource() == bsub) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 2;
				textField.setText("");
			}
			if(e.getSource() == bmul) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 3;
				textField.setText("");
			}
			if(e.getSource() == bdiv) {
				firstNumber = Double.parseDouble(textField.getText());
				operator = 4;
				textField.setText("");
			}
			
			if(e.getSource() == bksp) {
				String s=textField.getText();
				textField.setText("");
				for(int i=0;i<s.length()-1;i++)
					textField.setText(textField.getText()+s.charAt(i));
				
			}
			if(e.getSource() == beq) {
				secondNumber = Double.parseDouble(textField.getText());
				
				switch(operator) {
					case 1:
						result = firstNumber + secondNumber;
						break;
					case 2:
						result = firstNumber - secondNumber;
						break;
					case 3:
						result = firstNumber * secondNumber;
						break;
					case 4:
						result = firstNumber / secondNumber;
						break;
					default: result = 0.0;

				}
				textField.setText("" + result);
			}
			
			
			// Handler 
			
			
			
		
		
		}
	} // end of Calculator class