package phonemes;

import java.util.HashSet;

public class Cell extends HashSet<Phoneme> {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Grid grid_; // Keep a reference to the grid that we are in
	private int x_; 
	private int y_; 
	
	// TODO Coordinates in the grid
	// TODO these can change, so many something like a row header object
	// TODO and something for columns too. Or just be sure to update
	// TODO X and Y values when the cell is moved. 
	
	public Cell(Grid grid, int x, int y) {
		super(); 
		grid_ = grid;  
		x_ = x; 
		y_ = y; 
	}
	
	public void addPhoneme(Phoneme phoneme) {
		this.add(phoneme);
	}
	
	
	public void setX(int x) {
		x_ = x; 
	}
	
	public void setY(int y) {
		y_ = y; 
	}
	
	
	public Grid getGrid() {
		return grid_; 
	}
	
	public int getX() {
		return x_; 
	}
	
	public int getY() {
		return y_; 
	}

}
