package com.tree;

import java.util.Scanner;

public class Five_aryTree {
	static Scanner sc;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		createTree();
	}

	
	static Node1 createTree()
	{
		Node1 root = null;
		System.out.println("Enter Data");
		int data = sc.nextInt();
		if(data == -1) return null;
		root = new Node1(data);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("Enter data for child "+(i+1) +" for "+data);
			root.child[i]=createTree();
		}
		return root;
	}
}
class Node1
{
	int data;
	Node1 child[] = new Node1[5];
	public Node1(int data)
	{
		this.data = data;
	}
	
}