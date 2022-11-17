package maze;

public abstract class MazeBox implements graph.Vertex{
	
	private int indexLine;
	private int indexRow;
	private Maze refLabyrinthe;
	private boolean passable;
	
	
	public MazeBox(int indexLine, int indexRow, Maze refLabyrinthe) {
		super();
		this.indexLine = indexLine;
		this.indexRow = indexRow;
		this.refLabyrinthe = refLabyrinthe;
	}

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

	public Maze getRefLabyrinthe() {
		return refLabyrinthe;
	}

	public void setRefLabyrinthe(Maze refLabyrinthe) {
		this.refLabyrinthe = refLabyrinthe;
	}
	
	
	
}
