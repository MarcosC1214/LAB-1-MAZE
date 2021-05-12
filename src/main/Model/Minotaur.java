package main.Model;

public class Minotaur { // Minotaur class containing all geetters and setters.

	private int _row, _col;
	private boolean _isAlive;
	
	public int getRow() { return _row; } // Getter for the rows.
	public int getCol() { return _col; } // Getter for the colums.
	public void setPos(int r, int c) { _row = r; _col = c; } // Setter for the position.
	
	public Minotaur(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
	}
	
	public boolean isAlive() { return _isAlive; } // Checker to check if is alive.
}

