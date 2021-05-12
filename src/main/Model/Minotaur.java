package main.Model;

public class Minotaur {

	private int _row, _col;
	private boolean _isAlive;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	public Minotaur(int r, int c) {
		_row = r;
		_col = c;
		_isAlive = true;
	}
	
	public boolean isAlive() { return _isAlive; }
}

