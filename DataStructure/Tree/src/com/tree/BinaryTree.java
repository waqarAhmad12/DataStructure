package com.tree;

import java.util.Scanner;

public class BinaryTree {
	static Scanner sc = null;
	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Node root = createTree();
		inOrder(root);
	}
	static Node createTree()
	{
		Node root;
		System.out.println("Enter data :");
		int data = sc.nextInt();
		if(data == -1)
			return null;
		root = new Node(data);
		System.out.println("Enter left data for "+data);
		root.left = createTree();
		
		System.out.println("Enter right data for "+data);
		root.right = createTree();
		
		return root;
		
	}
	static void inOrder(Node root)
	{
		if(root == null) return;
		inOrder(root.left);
		System.out.print(root.data);
		inOrder(root.right);
	}

}
class Node
{
	int data;
	Node left,right;
	public Node(int data)
	{
		this.data=data;
	}
}