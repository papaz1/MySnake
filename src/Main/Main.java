package Main;

import javax.swing.JFrame;

/**
 *
 * @author TEMPBASOL
 */
public class Main {

    public static void main(String[] args) {
        Board board = new Board();

        //Setting up the window settings
        board.setTitle("Snake");
        board.setSize(300, 300);
        board.setVisible(true);
        board.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
