package com.waqar.weightedgraph;
import java.util.*;

public class AirportGraph {
	class Edge
	{
		
		String destination;
		int weight;
		protected Edge(String destination, int weight) {
			super();
			this.destination = destination;
			this.weight = weight;
		}
		@Override
		public String toString()
		{
			String s = destination+"(Distance ="+weight+")";
			return s;
		}
		
		
	}
	Map<String,List<Edge>> graph = new HashMap<>();
	
	public void addEdges(String source,String destination,int weight,boolean biDirectional)
	{
		if(!graph.containsKey(destination))
			addEdge(destination);
		if(!graph.containsKey(source))
			addEdge(source);
		if(biDirectional)
		{
			Edge e1 = new Edge(destination, weight);
			Edge e2 = new Edge(source , weight);
			graph.get(source).add(e1);
			graph.get(destination).add(e2);
		}
		else
		{
			Edge e1 = new Edge(destination, weight);
			graph.get(source).add(e1);
		}
	}

	private void addEdge(String destination) {
		graph.put(destination, new LinkedList<>());
		
	}
	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(String vertex:graph.keySet()) {
			builder.append(vertex.toString()+" : ");
			for(Edge w:graph.get(vertex)) {
				builder.append(w.toString()+" ");
			}
			builder.append("\n");
		}
		return (builder.toString());
		
	}
}
