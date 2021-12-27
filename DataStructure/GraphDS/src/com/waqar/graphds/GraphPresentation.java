package com.waqar.graphds;

import java.util.Scanner;

public class GraphPresentation {
	private Graph graph=new Graph();
	public void showMenu() {
		System.out.println("1. Add Edge ");
		System.out.println("2. Show Graph");
		System.out.println("3. count Vertices");
		System.out.println("4. count Edges");
		System.out.println("871. Exit");
	}
	
	public void performMenu(int choice) {
		Scanner scanner=new Scanner(System.in);
		switch(choice) {
		case 1:
			System.out.println("Enter Source : ");
			String source=scanner.next();
			System.out.println("Enter Destination : ");
			String destimation=scanner.next();
			System.out.println("Bidirectional : (true/false) : ");
			boolean bidirectional=scanner.nextBoolean();
			graph.addNewEdge(source, destimation, bidirectional);
			break;
		case 2:
			System.out.println(graph);
			break;
		case 3:
			System.out.println(graph.countVertices());
			break;
		case 4:
			System.out.println("EdgeCount = "+graph.countEdges());
			break;
		case 871:
			System.out.println("Thanks for using our System");
			System.exit(0);
		default:
			System.out.println("Invalid Choice");
		}
	}

}
