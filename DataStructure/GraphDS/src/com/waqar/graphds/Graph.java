package com.waqar.graphds;

import java.util.*;



public class Graph {
	class Edge
	{
		
		private String destination;
		private Boolean biDirected;
		protected Edge(String destination, Boolean biDirected) {
			super();
			this.destination = destination;
			this.biDirected = biDirected;
		}
		public boolean getBiDirected()
		{
			return biDirected;
		}
	
		
	}
	
private Map<String,List<Edge>> map=new HashMap<>();
	
	public void addNewVertex(String str) {
		map.put(str, new LinkedList<Edge>());
	}
	
	public void addNewEdge(String source,String destination,boolean bidirectional) {
		if(!map.containsKey(source))
			addNewVertex(source);
		if(!map.containsKey(destination))
			addNewVertex(destination);
		if(bidirectional)
		{
			Edge e1 = new Edge(destination, bidirectional);
			Edge e2 = new Edge(source , bidirectional);
			map.get(source).add(e1);
			map.get(destination).add(e2);
		}
		else
		{
			Edge e1 = new Edge(destination, bidirectional);
			map.get(source).add(e1);
		}
	}

	@Override
	public String toString() {
		StringBuilder builder=new StringBuilder();
		for(String vertex:map.keySet()) {
			builder.append(vertex.toString()+" : ");
			for(Edge w:map.get(vertex)) {
				builder.append(w.destination+" ");
			}
			builder.append("\n");
		}
		return (builder.toString());
		
	}
	public int countEdges()
	{
		int countBi =0;
		int countS=0;
		for(String s:map.keySet())
		{
			
			for(Edge e:map.get(s))
			{
				if(e.getBiDirected())
					countBi++;
			}
			for(Edge e:map.get(s))
			if(!e.getBiDirected())
			{
			countS++;
			}
		}
		return countS+countBi/2;
	}
	public int countVertices()
	{
		return map.size();
	}

}
