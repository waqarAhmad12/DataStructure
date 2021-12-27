package com.waqar.bean;

import java.io.IOException;
import java.util.Scanner;

public class DoublyLinkedMain {
public static void main(String[] args) throws NumberFormatException, IOException {
	Scanner sc= new Scanner(System.in);
	DoublyLinkedListPresentation present = new DoublyLinkedListPresentation();
	while(true) {
		present.showMenu();
		System.out.println("Enter choice : ");
		int choice=sc.nextInt();
		present.performMenu(choice);
		}
}
}
