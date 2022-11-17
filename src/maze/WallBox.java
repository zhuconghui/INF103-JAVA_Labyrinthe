package maze;

import java.util.List;

import graph.Vertex;

public class WallBox extends MazeBox{

	@Override
	public List<Vertex> getSuccesseur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vertex getPrevious() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setPrevious(Vertex sommet) {
		// TODO Auto-generated method stub
		
	}
	
	
	public WallBox(int indexLine, int indexRow, Maze labyrinthe) {
		super(indexLine,indexRow,labyrinthe);
	}

	public final String getBoxSymbol()
	{
		return "W";
	}

	

}
