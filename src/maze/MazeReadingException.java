package maze;

public class MazeReadingException extends Exception {

	public MazeReadingException(String fileName, int numLigne, String message) {
		
		System.out.println(fileName + "at " + numLigne + message);
	}
	
	
}
