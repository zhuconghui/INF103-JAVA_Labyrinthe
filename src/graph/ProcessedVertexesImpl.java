package graph;

import java.util.Set;

public class ProcessedVertexesImpl implements ProcessedVertexes{

	private Set <Vertex> ProcessedVertexs;
	
	
	public ProcessedVertexesImpl(Set<Vertex> processedVertexs) {
		this.ProcessedVertexs = processedVertexs;
	}

	public void marquer_Sommet(Vertex sommet) {
		ProcessedVertexs.add(sommet);
	}

	public boolean sommetExist(Vertex sommet) {
		return ProcessedVertexs.contains(sommet);
	}

}
