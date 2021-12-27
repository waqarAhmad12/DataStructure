package com.waqar.graph;

import java.util.Scanner;

public class Runner {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter vertices");
		Graph g = new Graph(sc.nextInt());
		System.out.println("Enter Edges");
		int e = sc.nextInt();
		System.out.println("Enter "+e+" edges");
		for(int i=0;i<e;i++)
		{
			g.addEdge(sc.nextInt(), sc.nextInt());
		}
		System.out.println("Enter source and destination");
		int s  = sc.nextInt();
		int d = sc.nextInt();
		System.out.println("Exist "+g.bfs(s, d));
	}

}
