package maze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import graph.Vertex;


public class Maze implements graph.Graph{

	private MazeBox [][] labyrinthe;
	private int nbCaseLine;
	private int nbCaseRow;
	
	public Maze(int nbCaseLine, int nbCaseRow) {
		super();
		MazeBox [][]labyrinthe = new MazeBox [nbCaseLine][nbCaseRow];
	}


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
	
	//Cette methode permet de lire le fichier ligne par ligne et afficher les lignes dans la console
	public final void initFromTextFile(String fileName)
	{
		//fileName = "data/labyrinthe.maze"
		String line = null;

		try (Reader fr = new FileReader(fileName); BufferedReader bufr = new BufferedReader(fr);) {

			for(int numLine=0; numLine<nbCaseLine;numLine++)
			{
				line = bufr.readLine();
				if(line == null) 
				{
					throw new MazeReadingException(fileName, numLine, " :ligne non detecte.");
				}
				else if(line.length() != nbCaseLine)
				{
					throw new MazeReadingException(fileName, numLine, " :le nombre de case n'est pas correct");
				}
				for(int numRow=0; numRow<nbCaseRow;numRow++)
				{
					if (line.charAt(numRow)=='E') labyrinthe[numLine][numRow] = new EmptyBox(numLine,numRow,this);
					if (line.charAt(numRow)=='W') labyrinthe[numLine][numRow] = new WallBox(numLine,numRow,this);
					if (line.charAt(numRow)=='D') labyrinthe[numLine][numRow] = new DepartureBox(numLine,numRow,this);
					if (line.charAt(numRow)=='A') labyrinthe[numLine][numRow] = new ArrivalBox(numLine,numRow,this);
				}
			}
			System.out.println(line);
			line = "";

		}

		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}
	
	public final void saveToTextFile(String fileName) 
	{
		try (FileOutputStream fos = new FileOutputStream(fileName); PrintWriter pr = new PrintWriter(fos)){
			for(int i=0;i<10;i++)
			{
				for(int j=0;j<10;j++)
				{
					pr.print(labyrinthe[i][j]);
				}
				pr.println();
			}
		}
		catch (Exception ex)
		{
			ex.printStackTrace();
		}

	}
}
