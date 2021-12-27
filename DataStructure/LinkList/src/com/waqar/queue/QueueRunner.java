package com.waqar.queue;

public class QueueRunner {
	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		Book b[] = new Book[6];
		b[0] =new Book(65,56,255.0,"HP2");
		 b[1] =new Book(1,200,1522.0,"HP");
		 b[2] =new Book(8,500,342.33,"TLR");
		 b[3] = new Book(3,100,900.2,"TR");
		 b[4] = new Book(7,104,709.4,"TJAVA");
		 b[5] = new Book(21,9900,190.3,"kaD");
		
		q.enQueue(b[0]);
		q.enQueue(b[1]);
		q.enQueue(b[2]);
		q.enQueue(b[3]);
		q.enQueue(b[4]);
		q.enQueue(b[5]);
		System.out.println(q.peek());
		
//		q.enQueue(new Book(1,200,1522.0,"HP"));
//		q.enQueue(new Book(8,500,342.33,"TLR"));
//		q.enQueue(new Book(3,100,324.2,"TR"));
//		q.enQueue(new Book(7,104,709.4,"TJAVA"));
//		q.enQueue(new Book(21,9900,190.3,"kaD"));
//		q.showQueue();System.out.println("After dQ");
//		System.out.println(q.deQueue());
//		System.out.println("yggyu\n");
		
		//q.showQueue();
//		System.out.println("After deQueue");
//		q.deQueue();
		
	}

}
