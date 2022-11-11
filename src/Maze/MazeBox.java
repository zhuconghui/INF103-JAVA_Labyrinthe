package Maze;

public abstract class MazeBox implements graph.Vertex{
	
	private int indexLine;
	private int indexRow;
	private int refLabyrinthe;
	private boolean passable;
	
	public boolean isPassable() {
		return passable;
	}

	public void setPassable(boolean passable) {
		this.passable = passable;
	}

	public String getLabel() {
		return "(" + indexLine + "," + indexRow + ")";
	}

	public int getIndexLine() {
		return indexLine;
	}

	public void setIndexLine(int indexLine) {
		this.indexLine = indexLine;
	}

	public int getIndexRow() {
		return indexRow;
	}

	public void setIndexRow(int indexRow) {
		this.indexRow = indexRow;
	}

	public int getRefLabyrinthe() {
		return refLabyrinthe;
	}

	public void setRefLabyrinthe(int refLabyrinthe) {
		this.refLabyrinthe = refLabyrinthe;
	}
	
	
	
}
