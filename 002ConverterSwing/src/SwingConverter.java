import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class SwingConverter implements ActionListener{
	private JPanel inputPanel = initInputPanel();
	private JTextField inputText;
	private JTextArea resultArea;
	private JButton enterButton;
	
	
	public SwingConverter() {
		javax.swing.JFrame myWindow = new javax.swing.JFrame("Base Converter - Created by Josh H.");
		myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myWindow.add(inputPanel);
		myWindow.setBackground(java.awt.Color.BLACK);
		myWindow.setSize(600,  500);
		myWindow.setVisible(true);	
	}
	public SwingConverter(String name) {
		
	}
	private JPanel initInputPanel() {
		JPanel panel = new JPanel();
		panel.setPreferredSize(new java.awt.Dimension(600, 500));
		panel.setLayout(null);
		
		JLabel label = new JLabel("Enter a base -10 number: ");
		label.setBounds(50, 50, 220, 30);
		panel.add(label);
		
		JTextField text;
		text = inputText = new JTextField();
		text.setBounds(230, 50, 100, 30);
		panel.add(text);
		
		JButton button = new JButton("Enter");
		button.setActionCommand("Enter");
		button.setBounds(340, 50, 80, 30);
		button.setBackground(java.awt.Color.GREEN);
		button.addActionListener(this);
		panel.add(button);
		
		enterButton = button;
				
		button = new JButton("Reset");
		button.setActionCommand("Reset");
		button.setBounds(430, 50, 80, 30);
		button.setBackground( new Color(0, 180, 0) );
		button.addActionListener(this);
		panel.add(button);
		
		resultArea = new JTextArea();
		resultArea.setBounds(50, 180, 500, 200);
		resultArea.setEditable(false);
		resultArea.setBackground( new Color(0, 180, 0) );
		panel.add(resultArea);
		
		
		
		return panel;
		
	}
	private void showResult() {
		String hexUpperCase;
		inputText.setEnabled(false);
		
		Integer n = getInputNumber();
		if (n== null) {
			resultArea.append("Invalid Number!");
			return;
			
		}
		int baseTen = n.intValue();
		resultArea.append("Decimal(Base Ten(0-9)) = " + baseTen + "\n");
		resultArea.append("Binary = " +Integer.toString(baseTen, 2) + "\n");
		resultArea.append("Octal = " + Integer.toString(baseTen, 8) + "\n");
		resultArea.append("Hexadecimal = " + Integer.toString(baseTen,16) +" \n");
		
		hexUpperCase = Integer.toString(baseTen, 16).toUpperCase();
		resultArea.append("Hexadecimal = " + hexUpperCase + "\n" );
		
	}
	private void reset() {
		inputText.setText(" ");
		resultArea.setText("");
		inputText.setEnabled(true);
		enterButton.setEnabled(true);
		inputText.requestFocus();
		
	}
	private Integer getInputNumber() {
		try {
			Integer n = Integer.parseInt(inputText.getText());
			return n;
			
		} catch (Exception e) {
			return null;
			
		}
	}
	public static void main(String[] args) throws Exception {
		new SwingConverter();
		
	}

	@Override
	public void actionPerformed(ActionEvent ev) {
		// TODO Auto-generated method stub
		String command = ev.getActionCommand();
		if (command.equals("Enter")) {
			showResult();
	
		} else if (command.equals("Reset")) {
			reset();
			
		}
		
	}
	
}
