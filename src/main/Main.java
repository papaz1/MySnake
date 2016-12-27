package main;

import java.awt.Point;

import controller.GameManager;
import model.SquarePosition;
import view.Board;

public class Main {

	public static void main(String[] args) {
		Board board = new Board(40, 40);
		Point boundaryTopLeft = new Point(0, 0);
		Point boundaryBottomRight = new Point(40, 40);

		Point foodStartingPoint = new Point(20, 20);

		SquarePosition food = new SquarePosition(foodStartingPoint, boundaryTopLeft, boundaryBottomRight);

		Point snakeHeadStartingPoint = new Point(10, 10);
		SquarePosition snake = new SquarePosition(snakeHeadStartingPoint, boundaryTopLeft, boundaryBottomRight);

		GameManager manager = new GameManager(board, food, snake);
		board.setVisible(true);
	}
}
