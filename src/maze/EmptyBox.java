package maze;

import java.util.List;

import graph.Vertex;

public class EmptyBox extends MazeBox{

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

	public EmptyBox(int indexLine, int indexRow, Maze labyrinthe) {
		super(indexLine,indexRow,labyrinthe);
	}
	
	public String getBoxSymbol()
	{
		return "E";
	}

	
	
}
