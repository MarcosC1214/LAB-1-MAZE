package main.Model;

public class Player {
	
	private int _row, _col;
	private boolean _isAlive;
	public boolean _hasSword;
	public boolean _spiDead;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	
	public Player(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
		_hasSword = false;
		_spiDead = false;
	}
	
	public boolean isAlive() { return _isAlive; }
	
	public void kill() { _isAlive = false; }
}
