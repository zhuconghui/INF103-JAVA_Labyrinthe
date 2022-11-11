package Maze;

import java.util.ArrayList;
import java.util.List;

import graph.Vertex;


public class Maze implements graph.Graph{

	private MazeBox [][] labyrinthe;
	
	public void addCase(MazeBox sommet)
	{
		labyrinthe[sommet.getIndexLine()][sommet.getIndexRow()]=sommet;
	}
	
	
	public ArrayList <MazeBox> askVoisin (MazeBox sommet)
	{
		ArrayList <MazeBox> voisin = new ArrayList <MazeBox> ();
		
		//determiner si la case droite est son voisin
		if(sommet.getIndexLine() + 1 <= 9)
		{
			if(labyrinthe[sommet.getIndexLine()+1][sommet.getIndexRow()].isPassable()==true)
			{
				voisin.add(labyrinthe[sommet.getIndexLine()+1][sommet.getIndexRow()]);
			}
		}
		
		//determiner si la case gauche est son voisin
		if(sommet.getIndexLine() - 1 <= 0)
		{
			if(labyrinthe[sommet.getIndexLine()-1][sommet.getIndexRow()].isPassable()==true)
			{
				voisin.add(labyrinthe[sommet.getIndexLine()+1][sommet.getIndexRow()]);
			}
		}
		
		//determiner si la case en haut est son voisin
		if(sommet.getIndexRow() - 1 <= 0)
		{
			if(labyrinthe[sommet.getIndexLine()][sommet.getIndexRow()-1].isPassable()==true)
			{
				voisin.add(labyrinthe[sommet.getIndexLine()+1][sommet.getIndexRow()]);
			}
		}
		
		//determiner si la case en bas est son voisin
		if(sommet.getIndexRow() + 1 <= 0)
		{
			if(labyrinthe[sommet.getIndexLine()][sommet.getIndexRow()+1].isPassable()==true)
			{
				voisin.add(labyrinthe[sommet.getIndexLine()+1][sommet.getIndexRow()]);
			}
		}
		
		return voisin;
		
	}
	
	
	public List<Vertex> getAllVertexes()
	{
		ArrayList <Vertex> sommets = new ArrayList<Vertex>();
		
		for(int i=0;i<10;i++)
		{
			for(int j=0;j<10;j++)
			{
				sommets.add(labyrinthe[i][j]);
			}
		}
		return sommets;
		
	}
	
	
	public List<Vertex> getSuccessors(Vertex vertex)
	{
		
		return vertex.getSuccesseur();
		
	}
	
	// Chaque arc entre deux cases a un poids de 1
	public int getWeight(Vertex src,Vertex dst)
	{
		return 1;
		
	}
}
