package com.waqar.doublylist;

import com.waqar.bean.Person;

public class DoublyLinkedList {
	Node head;
	public void insert(Person data)
	{
		Node node = new Node(data);
		if(head==null)
		{
			head = node;
			System.out.println("First Node created");
		}
		else
		{
			Node h = head;
			while(h.next!=null)
			{
				h=h.next;
			}
			h.next=node;
			node.prev=h;
			System.out.println("data added!");
		}
		
	}
	public  void showList()
	{
		Node h = head;
		if(h==null)
		{
			System.out.println("empty node");
			return;
		}
		while(h!=null)
		{
			System.out.println(h.person);
			h=h.next;
		}
	}
	public void deleteFirst()
	{
		Node h = head;
		if(h==null)
		{
			System.out.println("Empty LinkList");
			return;
		}
		head = h.next;
		h.prev=null;
		
		
	}
	public void delete(int id)
	{
		Node h=head;
		if(head==null)
		{
			System.out.println("Empty Link list");
			return;
		}
		if(h.person.getId() == id)
		{
			deleteFirst();
			return;
		}
		while(h.person.getId()!=id && h!=null)
		{
			h=h.next;
		}
		if(h==null)
		{
			System.out.println("Node with person ID "+id+" doesn't exists");
			return;
		}
		
		if(h.next==null)
		{
			h.prev.next=null;
			h.prev=null;
			System.out.println("deleted");
			return;
		}
		h.prev.next=h.next;
		h.next.prev=h.prev;
		System.out.println("deleted");
		
	}

}

class Node
{
	Person person;
	Node next;
	Node prev;
	public Node(Person person)
	{
		this.person=person;
	}
}