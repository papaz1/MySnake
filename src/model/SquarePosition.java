package model;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;

import enums.Direction;

/**
 * Positions in the grid define where the snake and the food should be placed
 * out
 * 
 * @author TEMPBASOL
 *
 */
public class SquarePosition {
	private final List<Point> positions;

	/**
	 * The game will begin by adding food and snake to the board. These are
	 * confined within the boards boundaries.
	 * 
	 * @param position
	 *            Starting position
	 * @param boundaryTopLeft
	 *            Board top left coordinate
	 * @param boundaryBottomRight
	 *            Board bottom right coordinate
	 */
	public SquarePosition(Point position, Point boundaryTopLeft, Point boundaryBottomRight) {
		positions = new ArrayList<Point>();
		positions.add(position);// Starting position
	}

	public void add(Point position) {
		positions.add(position);
	}

	public void move(Direction d) {

	}

	public List<Point> getPositions() {
		return positions;
	}
}
