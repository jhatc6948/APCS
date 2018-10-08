package mousedraw;

import javax.swing.JFrame;
import java.awt.Graphics2D;
import java.awt.GridBagLayout;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseDraw extends JFrame {
	Graphics2D g2D;

	public MouseDraw() {

		setTitle("Artistic Creations of Josh Hatch! October 2018");
		setResizable(false);
		setSize(600, 400);
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				exitForm(e);
			}

		});
		getContentPane().setLayout(new GridBagLayout());
	}

	private void exitForm(WindowEvent e) {
		g2D.dispose();
		System.exit(0);

	}

}
