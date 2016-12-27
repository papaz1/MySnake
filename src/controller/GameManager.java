package controller;

import model.SquarePosition;
import view.Board;

//This class controls the flow of the game
public class GameManager implements Runnable {

	private Board board;
	private SquarePosition food;
	private SquarePosition snake;

	public GameManager(Board board, SquarePosition food, SquarePosition snake) {
		this.board = board;
		this.food = food;
		this.snake = snake;
	}

	@Override
	public void run() {

	}

}
