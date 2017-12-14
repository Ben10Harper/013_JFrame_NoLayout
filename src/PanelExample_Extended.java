import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelExample_Extended {

	public JPanel createContentPane() {

		// We create a bottom JPanel to place everything on.
		JPanel totalGUI = new JPanel();

		// We set the Layout Manager to null so we can manually place
		// the Pane;s.
		totalGUI.setLayout(null);
		totalGUI.setBackground(Color.YELLOW);

		// Now we create a new panel, size it, shape it, color it red.
		// then add it to the bottom JPanel.
		JPanel redPanel = new JPanel();
		redPanel.setLayout(null);
		redPanel.setBackground(Color.RED);
		redPanel.setLocation(10, 10);
		redPanel.setSize(100, 100);
		totalGUI.add(redPanel);
		
		JButton b1 = new JButton("STOP");
		b1.setBounds(13,40,75,20);
		b1.setBackground(Color.BLUE);
		redPanel.add(b1);
		
		JLabel redLabel = new JLabel("Red");
		redLabel.setLocation(0,0);
		redLabel.setSize(50,40);
		redLabel.setHorizontalAlignment(0);
		redPanel.add(redLabel);

		JPanel bluePanel = new JPanel();
		bluePanel.setLayout(null);
		bluePanel.setBackground(Color.BLUE);
		bluePanel.setLocation(460, 10);
		bluePanel.setSize(100, 100);
		totalGUI.add(bluePanel);
		
		JButton b2 = new JButton("START");
		b2.setBounds(10,40,80,20);
		b2.setBackground(Color.RED);
		bluePanel.add(b2);
		
		JLabel blueLabel = new JLabel("Blue");
		blueLabel.setLocation(0,0);
		blueLabel.setSize(50,40);
		blueLabel.setHorizontalAlignment(0);
		bluePanel.add(blueLabel);
		
		JPanel greenPanel = new JPanel();
		greenPanel.setLayout(null);
		greenPanel.setBackground(Color.GREEN);
		greenPanel.setLocation(120, 10);
		greenPanel.setSize(330, 100);
		totalGUI.add(greenPanel);
		
		JLabel greenLabel = new JLabel("Green");
		greenLabel.setLocation(0,0);
		greenLabel.setSize(50,40);
		greenLabel.setHorizontalAlignment(0);
		greenPanel.add(greenLabel);
		
		JPanel orangePanel = new JPanel();
		orangePanel.setLayout(null);
		orangePanel.setBackground(Color.ORANGE);
		orangePanel.setLocation(10, 120);
		orangePanel.setSize(550, 100);
		totalGUI.add(orangePanel);
		
		JLabel leftLabel = new JLabel("Left");
		leftLabel.setLocation(20,30);
		leftLabel.setSize(50,40);
		leftLabel.setHorizontalAlignment(0);
		orangePanel.add(leftLabel);
		
		JLabel rightLabel = new JLabel("Right");
		rightLabel.setLocation(480,30);
		rightLabel.setSize(50,40);
		rightLabel.setHorizontalAlignment(0);
		orangePanel.add(rightLabel);
		
		JPanel cyanPanel = new JPanel();
		cyanPanel.setLayout(null);
		cyanPanel.setBackground(Color.CYAN);
		cyanPanel.setLocation(110, 10);
		cyanPanel.setSize(330, 80);
		orangePanel.add(cyanPanel);
		
		JPanel pinkPanel = new JPanel();
		pinkPanel.setLayout(null);
		pinkPanel.setBackground(Color.PINK);
		pinkPanel.setLocation(105, 10);
		pinkPanel.setSize(120, 60);
		cyanPanel.add(pinkPanel);
		
		JButton b3 = new JButton("Push Me");
		b3.setBounds(13,20,95,20);
		b3.setBackground(Color.ORANGE);
		pinkPanel.add(b3);

		// Finally we return the JPanel
		totalGUI.setOpaque(true);
		return totalGUI;
	}
}
