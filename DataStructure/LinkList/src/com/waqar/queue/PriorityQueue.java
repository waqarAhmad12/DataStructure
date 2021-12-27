package com.waqar.queue;

public class PriorityQueue {
	Node head;
	
	Book peek()
	{
		return head.data;
	}
 void enQueue(Book data)
	{
	
		Node node = new Node(data);
		 if(head == null)
		 {
			 head=node;
			 return ;
		 }
		Node h = head;
		if(h.data.getPages()<node.data.getPrice())
		{
			node.next = head;
			head = node;
		}
		else
		{
			while(h.data.getPrice()<node.data.getPrice() && h.next != null)
			{
				h = h.next;
			}
			node.next = h.next;
			h.next=node;
		}
		
		
	}
	public Book deQueue()
	{
		Node tem = head;
		head=head.next;
		return tem.data;
	}
	int getQueueSize()
	{
		Node h = head;
		int count=0;
		while(h!=null)
		{
			h=h.next;
			count++;
		}
		return count;
	}
	void showQueue()
	{
		Node h=head;
		while(h!=null)
		{
			System.out.println(h.data);
			h=h.next;
		}
	}
	
}
class Node
{
	Book data;
	Node next;
	public Node(Book data)
	{
		this.data = data;
	}
}
