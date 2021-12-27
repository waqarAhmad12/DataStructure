package com.waqar.bean;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.waqar.doublylist.DoublyLinkedList;

public class DoublyLinkedListPresentation {
	DoublyLinkedList list = new DoublyLinkedList();
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void showMenu()
	{
		System.out.println("\n1-Insert data\n2-delete  data\n3-show list\n4-Delete First Node");
	}
	public void performMenu(int choice) throws NumberFormatException, IOException
	{
		
	
		switch(choice)
		{
		case 1:
			System.out.println("Enter person ID and Name");
			int id=Integer.parseInt(br.readLine());
			String name = br.readLine();
			list.insert(new Person(id,name));
			break;
		case 2:
			System.out.println("Enter person ID to delete that NODE");
			int pid = Integer.parseInt(br.readLine());
			list.delete(pid);
			break;
			
		case 3:list.showList();break;
		case 4:list.deleteFirst();break;
		
		}
	}

}
