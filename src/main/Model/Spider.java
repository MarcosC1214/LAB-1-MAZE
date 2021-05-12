package main.Model;

public class Spider {
	private int _row, _col;
	boolean _spiDead;
	
	public int getRow() { return _row; }
	public int getCol() { return _col; }
	public void setPos(int r, int c) { _row = r; _col = c; }
	
	public Spider(int r, int c) {
		_row = r;
		_col = c;
		_spiDead = false;
	}
	
	public boolean isAlive() { return _spiDead; }
}