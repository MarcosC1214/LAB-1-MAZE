package main.Model;

public class Player { // Player class containing all player getters and setters.
	
	private int _row, _col;
	private boolean _isAlive;
	public boolean _hasSword;
	public boolean _spiDead;
	
	public int getRow() { return _row; } // Getter for player rows.
	public int getCol() { return _col; } // Getter for player colums.
	public void setPos(int r, int c) { _row = r; _col = c; } // Setter for player position.
	
	
	public Player(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
		_hasSword = false;
		_spiDead = false;
	}
	
	public boolean isAlive() { return _isAlive; } // Boolean checker if player is alive.
	
	public void kill() { _isAlive = false; } // Boolean checker for kill which player has died.
}
