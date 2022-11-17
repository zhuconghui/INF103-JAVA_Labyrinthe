package maze;

public class MainTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maze labyrinthe = new Maze(10,10);
		labyrinthe.initFromTextFile("data/labyrinthe.maze");
//		labyrinthe.saveToTextFile("data/labyrinthe2.maze");
	}

}
