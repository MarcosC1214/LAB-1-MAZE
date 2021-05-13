package main.Model;

public class Spider { // Class for 2nd monster consistin of spiders and getters and setters.
	private int _row, _col;
	boolean _spiDead;
	
	public int getRow() { return _row; } // Getter for rows.
	public int getCol() { return _col; } // Getter for colums.
	public void setPos(int r, int c) { _row = r; _col = c; } // Setter for spider position.
	
	public Spider(int r, int c) {
		_row = r;
		_col = c;
		_spiDead = false;
	}
	
	public boolean isAlive() { return _spiDead; } // Boolean checker if spider is alive.
}
