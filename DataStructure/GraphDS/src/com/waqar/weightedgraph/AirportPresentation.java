package com.waqar.weightedgraph;

import java.util.Scanner;

public class AirportPresentation {
	AirportGraph airport = new AirportGraph();
	Scanner sc = new Scanner(System.in);
	void showMenu()
	{
		System.out.println("1. Add Route");
		System.out.println("2. Show all route");
	}
	void performMenu(int choice)
	{
		AirportGraph airport = new AirportGraph();
		Scanner sc = new Scanner(System.in);
		switch(choice)
		{
		case 1:
			System.out.println("Enter source city");
			String source = sc.next();
			System.out.println("Enter destination city");
			String des = sc.next();
			System.out.println("Enter distance between two city");
			int dis = sc.nextInt();
			airport.addEdges(source, des, dis, true);
			break;
		case 2:
			System.out.println("Airport List..");
			System.out.println(airport);
			break;
		}
	}

}
