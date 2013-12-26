package phonemes;

public class Grid {
	
	private Cell[][] grid_; 
	private int maxX_; 
	private int maxY_; 
	
	/*
	 * Constructor
	 * 
	 */
	public Grid(int maxX, int maxY) {
		maxX_ = maxX; 
		maxY_ = maxY; 
		grid_ = new Cell[maxX][maxY];
	}
	
	public void set(int x, int y, Cell elem) {
		if (x < 0 || x >= maxX_) {
			// TODO fail
		} else if (y < 0 || y >= maxY_) {
			// TODO fail
		}
		
		// TODO do the actual setting
		grid_[x][y] = elem; 
	}
	
	// TODO we need a setter that adds things to the cell, and also 
	// TODO checks for null and creates a cell if it is null. 
	
	public Cell get(int x, int y) {
		return grid_[x][y]; 
	}
	
	public void insertColumn(int x) {
		// move cells, and update their x and y values
		maxX_++; 
		Cell[][] updated = new Cell[maxX_][maxY_];
		
		for (int i = 0; i < x; i++) {
			updated[i] = grid_[i];
		}
		
		updated[x] = new Cell[maxY_];
		
		for (int i = x; i < maxX_-1; i++) {
			updated[i+i] = grid_[i];
			for (Cell c : updated[i+1]) {
				c.setX(c.getX() + 1);
			}
		}
		
		grid_ = updated; 
		
		// TODO TEST!
	}
	
	public void insertRow(int y) {
		// TODO
	}
	
	public void deleteColumn(int x) {
		// TODO this should be a bit easier. Just bring the old columns
		// TODO over, and replace the last set with nulls. No need to shrink
		// TODO the array. 
		
		// TODO
	}
	
	public void deleteRow(int y) {
		// TODO
	}

}
