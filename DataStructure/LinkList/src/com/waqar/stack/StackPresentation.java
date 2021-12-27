package com.waqar.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StackPresentation {
	Stack stack = new Stack();
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public void showMenu()
	{
		System.out.println("1-push\n2-pop\n3-Display");
	}
	public void performMenu(int n) throws NumberFormatException, IOException
	{
		switch(n)
		{
		case 1:
			System.out.println("Enter Employee ID");
			int id = Integer.parseInt(br.readLine());
			System.out.println("Enter Employee name");
			String name = br.readLine();
			stack.push(new Employee(id,name));
			
			break;
		case 2:
			stack.pop();
			System.out.println("poped");
			break;
		case 3:
			stack.showStack();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
	}

}
