package main.View;

import main.Model.Maze;
import main.Model.Minotaur;
import main.Model.Player;
import main.Model.Spider;

public class stringMap { // String Map Class for all visible strings within the panel including walls and characters.


	private final String _wall = "!!! ";
	private final String _path = "    ";
	private final String _ply = "\u2665 ";
	private final String _min = "\u2660 ";
	private final String _exit = "\u2666 ";
	private final String _space = "   ";
	private final String _sword = "~}";
	private final String _spider = "\u2663";
	
	private Maze _maze;
	private Player _plyr;
	private Minotaur _mint;
	private Spider _spid;
	
	public stringMap(Maze m, Player p, Minotaur t, Spider q) {
		_maze = m;
		_plyr = p;
		_mint = t;
		_spid = q;
	}
	
	public String generateMap(int vision) { // Helper method to generate the map within the frame. 
		 String map = "";
	     int r1 = _plyr.getRow();
	     int c1 = _plyr.getCol();
	     
	     int r2 = r1 - vision;
	     
	     // Limits player visibility
	     if( r2 < 0) {
	    	 r2 = 0;
	     }
	     
	     int c2 = c1 - vision;
	     
	     if( c2 < 0) {
	    	 c2 = 0;
	     }
	     
	     int r3 = r1 + vision;
	     if( r3 > _maze.getMaze().length - 1) {
	    	 r3 = _maze.getMaze().length - 1;
	     }
	     
	     int c3 = c1 + vision;
	     if( c3 > _maze.getMaze()[0].length - 1) {
	    	 c3 = _maze.getMaze()[0].length - 1;
	     }
	    		 
		 for(int r = r2; r <= r3; r++) {
			 for(int c = c2; c <= c3; c++) {
				 if(_plyr.getRow() == r && _plyr.getCol() == c) {
					 map += _ply + _space;
				 }
				 else if(_mint.getRow() == r && _mint.getCol() == c) {
					 map += _min + _space; 
				 }
				 else if(_maze.getExit()[0] == r && _maze.getExit()[1] == c) {
					 map += _exit + _space; 
				 }
				 else if(_spid.getRow() == r && _spid.getCol() == c){
					 map += _spider + _space;
				 }
				 else if(_maze.getSword()[0] == r && _maze.getSword()[1] == c && !_plyr._hasSword) {
					 map += _sword + _space; 
				 }
				 else if(_maze.getMaze()[r][c]) {
					 map += _path + _space;
				 }
				 else {
					map += _wall + _space; 
				 }
			 }
			 map += "\n";
		 }
		 map += "\n";      
		
		 
		 
		 
		 
		 return map;
	}
	
}
