package main.Model;

public class Sword { // Sword class for player along with getters and setters.
	
	private int _row, _col;
	
	public int getRow() { return _row; } // Getter fir rows.
	public int getCol() { return _col; } // Getter for colums.
	
	public Sword(int r, int c) {
		_row = r;
		_col = c;
	}
}
