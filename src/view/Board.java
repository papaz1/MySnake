package view;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JFrame;

public class Board extends JFrame {

	private static final long serialVersionUID = 1L;
	public static ArrayList<ArrayList<Square>> grid;
	private int noRows;
	private int noCols;

	public Board(int noRows, int noCols) {
		this.noRows = noRows;
		this.noCols = noCols;

		// Setting up the window settings
		setTitle("MySnake");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		grid = new ArrayList<>();
		ArrayList<Square> cells;

		// Initialize a white board
		for (int i = 0; i < noRows; i++) {
			cells = new ArrayList<>();
			for (int j = 0; j < noCols; j++) {
				cells.add(new Square(Color.WHITE));
			}
			grid.add(cells);
		}

		// Setting up the layout of the panel
		getContentPane().setLayout(new GridLayout(noRows, noCols, 0, 0));
		for (int i = 0; i < noRows; i++) {
			for (int j = 0; j < noCols; j++) {
				getContentPane().add(grid.get(i).get(j));
			}
		}
	}
}
