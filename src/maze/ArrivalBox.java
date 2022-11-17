package maze;

public class ArrivalBox extends EmptyBox{
	
	public ArrivalBox(int indexLine, int indexRow, Maze labyrinthe) {
		super(indexLine,indexRow,labyrinthe);
	}

	public final String getBoxSymbol()
	{
		return "A";
	}
}
