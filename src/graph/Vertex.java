package graph;

import java.util.List;

public interface Vertex {

	public List<Vertex> getSuccesseur();
	
	public Vertex getPrevious();
	
	public void setPrevious(Vertex sommet);
}
