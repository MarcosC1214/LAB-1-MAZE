package main.Model;

import main.Controller.JOP;
import main.View.stringMap;

public class World {

	private Player _p;
	private Minotaur _t;
	private Maze _m;
	private stringMap _s;
	private int cnt = 0;
	private Sword _S;
	private Spider _q;
	private String hello;

	public World(String s) {
		_m = new Maze(s);
		_p = new Player(_m.getPlyStart()[0], _m.getPlyStart()[1]);
		_t = new Minotaur(_m.getMinStart()[0], _m.getMinStart()[1]);
		_S = new Sword(_m.getSword()[0], _m.getSword()[1]);
		_q = new Spider(_m.getSpiderStart()[0], _m.getSpiderStart()[1]);
		_s = new stringMap(_m, _p, _t, _q);
		hello = s;
		update();
	}

	public boolean isWall(int x, int y) {
		return this._m.isAWall(x, y);
	}
	
	public void update() {

		boolean isPlaying = true;
		while (isPlaying) {
			boolean on = true;
			// Get the Map
			String map = "";
			if(hello.equalsIgnoreCase("e")) {
				map = _s.generateMap(5);
			}
			
			else if(hello.equalsIgnoreCase("m")) {
				map = _s.generateMap(10);
			}
			
			else if(hello.equalsIgnoreCase("h")) {
				map = _s.generateMap(15);
			}
			
			String msg = "WASD to move. What direction do you want to move? (Type ( ` ) to leave game any time you like)";

			while (on) {
				// Get the player move
				String move = JOP.in(map + msg);
				// move the player
				if(move == null) {
					
				}
				
				else if(move.equalsIgnoreCase("e") || move.equalsIgnoreCase("m") || move.equalsIgnoreCase("h")) {
					_m = new Maze(move);
					_p = new Player(_m.getPlyStart()[0], _m.getPlyStart()[1]);
					_t = new Minotaur(_m.getMinStart()[0], _m.getMinStart()[1]);
					_S = new Sword(_m.getSword()[0], _m.getSword()[1]);
					_q = new Spider(_m.getSpiderStart()[0], _m.getSpiderStart()[1]);
					_s = new stringMap(_m, _p, _t, _q);
					update();
				}
				
				else if(move.equalsIgnoreCase("god")) {
					isPlaying = false;
					JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
							"Victory!\n You moved " + cnt + " steps."+" Would you like to play again?\r\n" + 
							"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					update();
				}
				else if (getPlayerMove(move)) {
					on = false;
				}
				
				else if (move.equalsIgnoreCase("`")) {
					System.exit(0);
				}
			}

			// check for victory
			if (victory()) {
				isPlaying = false;
				JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
						"You have Escaped! Congrats!\n You moved " + cnt + " steps."+" Would you like to play again?\r\n" + 
						"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				update();
				
			}
			// move the minotaur
			moveMinotaur();
			
			// move the spiders
			moveSpider();
			
			// check for death
			if(death()) {
				isPlaying = false; 
				JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
						"YOU DIED\n You moved " + cnt + " steps."+" Would you like to play again?\r\n" + 
						"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				update();
			}
			
			// check for sword
			hasSword();
			
			// check for min death
			if (minDeath()) {
				isPlaying = false;
				JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
						"You have slained The Minotaur!\n You moved " + cnt + " steps."+" Would you like to play again?\r\n" + 
						"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
				update();
				
			}
			// check for spiDeath
			if(spiDead()) {
			JOP.msg("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\r\n" + 
					"You have killed the spider \r\n" + 
					"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}
		}
	
		
	}
	
	private boolean getPlayerMove(String s) {

		// Moving North
		if (s.equalsIgnoreCase("W")) {
			if ((_p.getRow() - 1) >= 0 && _m.getMaze()[_p.getRow() - 1][_p.getCol()]) {
				_p.setPos(_p.getRow() - 1, _p.getCol());
				cnt++;
				return true;
			} else {
				return false;
			}
			
		}
		// Moving South
		if (s.equalsIgnoreCase("S")) {
			if ((_p.getRow() + 1) < _m.getMaze().length && _m.getMaze()[_p.getRow() + 1][_p.getCol()]) {
				_p.setPos(_p.getRow() + 1, _p.getCol());
				cnt++;
				return true;
			} else {
				return false;
			}
		}
		// Moving East
		if (s.equalsIgnoreCase("D")) {
			if ((_p.getCol() + 1) < _m.getMaze()[0].length && _m.getMaze()[_p.getRow()][_p.getCol() + 1]) {
				_p.setPos(_p.getRow(), _p.getCol() + 1);
				cnt++;
				return true;
			} else {
				return false;
			}
		}
		// Moving West
		if (s.equalsIgnoreCase("A")) {
			if ((_p.getCol() - 1) >= 0 && _m.getMaze()[_p.getRow()][_p.getCol() - 1]) {
				_p.setPos(_p.getRow(), _p.getCol() - 1);
				cnt++;
				return true;
			} else {
				return false;
			}
		}

		return false;
	}
	
	private void moveMinotaur() {
		int rDist = _p.getRow() - _t.getRow();
		int cDist = _p.getCol() - _t.getCol();
		int r = _t.getRow();
		int c = _t.getCol();
		
		// Minotaur moving North
		if(rDist < 0 && _m.getMaze()[r - 1][c]) {
			_t.setPos(r - 1, c);
		}

		// Minotaur moving South.
		if(rDist > 0 && _m.getMaze()[r + 1][c]) {
			_t.setPos(r + 1, c);
		}
		// Minotaur moving East
		if(cDist > 0 && _m.getMaze()[r][c + 1]) {
			_t.setPos(r, c + 1);
		}
		// Minotuar moving west
		if(cDist < 0 && _m.getMaze()[r][c - 1]) {
			_t.setPos(r, c - 1);
		}
	}
	
	private void moveSpider() {
		
			int rDist = _p.getRow() - _q.getRow();
			int cDist = _p.getCol() - _q.getCol();
			int r = _q.getRow();
			int c = _q.getCol();
			
			
			
			// Spiders moving North
			if(rDist < 0 && _m.getMaze()[r - 1][c]) {
				_q.setPos(r - 1, c);
			}
			// Spiders moving South.
			if(rDist > 0 && _m.getMaze()[r + 1][c]) {
				_q.setPos(r + 1, c);
			}
			// Spiders moving East
			if(cDist > 0 && _m.getMaze()[r][c + 1]) {
				_q.setPos(r, c + 1);
			}
			// Spiders moving west
			if(cDist < 0 && _m.getMaze()[r][c - 1]) {
				_q.setPos(r, c - 1);
			}
	}
	
	
	public boolean death() {
		if(_t.getRow() == _p.getRow() && _t.getCol() == _p.getCol() && !_p._hasSword || _q.getRow() == _p.getRow() && _q.getCol() == _p.getCol() && !_p._hasSword) {
			return true;
		}
		return false;
	}
	
	public boolean minDeath() {
			if(_p._hasSword && _t.getRow() == _p.getRow() && _t.getCol() == _p.getCol()) {
				return true;
		}
		return false;
	}
	
	public boolean hasSword() {
		if(_p.getRow() == _S.getRow() &&
				_p.getCol() == _S.getCol()) {
			if(!_p._hasSword) {
				JOP.msg("*Sword has now been added to inventory. " + "\n               /| _______________\r\n" + 
						"O|===|* >________________>\r\n" + 
						"               \\| ");
			}
			_p._hasSword = true;
			return true;
		}
		return false;
	}
	
	public boolean spiDead() {
		if(_p.getRow() == _q.getRow() && _p.getCol() == _q.getCol() && !_p._hasSword) {
			_q._spiDead = true;
			return true;
		}
		return false;
	}

	public boolean victory() {
		if (_p.getRow() == _m.getExit()[0] && _p.getCol() == _m.getExit()[1])
			{return true;}
		return false;
	}
}
