package maze;

public class DepartureBox extends EmptyBox{
	
	public DepartureBox(int indexLine, int indexRow, Maze labyrinthe) {
		super(indexLine,indexRow,labyrinthe);
	}

	public final String getBoxSymbol()
	{
		return "D";
	}
}
