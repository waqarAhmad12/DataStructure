package com.waqar.weightedgraph;

public class AirportMain {
	public static void main(String[] args) {
		AirportGraph g = new AirportGraph();
		g.addEdges("Kanpur", "Lucknow", 50, true);
		g.addEdges("kanpur", "Delhi", 800, true);
		g.addEdges("GAO", "Mumbai", 711, true);
		g.addEdges("Mumbai", "pune", 421, true);
		g.addEdges("Mumbai", "Delhi", 2000, true);
		System.out.println(g);
	}

}
