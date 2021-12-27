package com.waqar.stack;

import java.io.IOException;
import java.util.Scanner;

public class StackRunner {
public static void main(String[] args) throws NumberFormatException, IOException {
	Scanner sc = new Scanner(System.in);
	StackPresentation present = new StackPresentation();
	while(true)
	{
		present.showMenu();
		int choice = sc.nextInt();
		present.performMenu(choice);
	}
}
}
