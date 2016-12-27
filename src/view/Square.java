package view;

import java.awt.Color;

import javax.swing.JPanel;

public class Square extends JPanel {
	private static final long serialVersionUID = 1L;

	public Square() {
		setBackground(Color.DARK_GRAY);
	}

	public Square(Color c) {
		setBackground(c);
	}

	public void changeColor(Color c) {
		setBackground(c);
		repaint();
	}
}
