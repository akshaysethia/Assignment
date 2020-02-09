package Lab5;

import javax.swing.*;
import java.awt.event.*;

public class Lab5_1 extends JFrame implements ActionListener {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	JRadioButton rb1, rb2, rb3;
	JButton b;

	Lab5_1() {
		rb1 = new JRadioButton("Red");
		rb2 = new JRadioButton("Yellow");
		rb3 = new JRadioButton("Green");
		rb1.setBounds(100, 50, 100, 30);
		rb2.setBounds(100, 100, 100, 30);
		rb3.setBounds(100, 150, 100, 30);
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		b = new JButton("Click");
		b.setBounds(100, 220, 100, 30);
		b.addActionListener(this);
		add(rb1);
		add(rb2);
		add(rb3);
		add(b);
		setSize(300, 300);
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (rb1.isSelected()) {
			JOptionPane.showMessageDialog(this, "Stop");
		}
		if (rb2.isSelected()) {
			JOptionPane.showMessageDialog(this, "Ready");
		}
		if (rb3.isSelected()) {
			JOptionPane.showMessageDialog(this, "Go");
		}
	}

	public static void main(String[] args) {
		new Lab5_1();
	}

}
