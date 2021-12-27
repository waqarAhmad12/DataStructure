package com.waqar.stack;

public class Stack {
	
	Node top;
	void push(Employee data)
	{ Node h = top;
		while(h!=null)
		{
			if(h.data.getId() == data.getId())
			{
				System.out.println("Duplicate Employee");
				return;
			}
			h=h.next;
		}
		Node node = new Node(data);
		if(top==null)
		{
			top = node;
		}
		else
		{
			node.next=top;
			top=node;
		}
		System.out.println("Pushed");
	}
	void pop()
	{
		if(top==null)
		{
			System.out.println("UnderFlow");
			return;
		}
		else
		{
			top=top.next;
		}
	}
	public void showStack()
	{
		if(top==null)
		{
			System.out.println("Underflow");
		}
		else
		{
			Node h =top;
			while(h!=null)
			{
				System.out.println(h.data);
				h=h.next;
			}
				
		}
	}

}
class Node
{
	Employee data;
	Node next;
	public Node(Employee data)
	{
		this.data = data;
	}
}
