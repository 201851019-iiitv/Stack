package stackLinkedList;

import java.util.Scanner;

import stack.StackArrayList;

public class DriverStackLinkedList {

	public static void main(String[] args) {
		StackLinkedList ob=new StackLinkedList();
		Scanner sc=new Scanner(System.in);
		int choice;
		int f = 1;
		while(f==1) {
		System.out.println("1.push element\n2.peek element\n3.pop element\n4.traverse array\n5.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		          f=1;
		         Integer  value1=sc.nextInt();
		         ob.Push(value1);
		           break;
		case 2:System.out.println(" Your present stack is");
                  Integer x=(Integer)ob.peek();
                  f=1;
                  System.out.println("ELEMENT IS"+" "+x);
                  break;
		case 3:
	         Integer y=(Integer)ob.pop();
	         System.out.println("DELETED ELEMENT IS"+y);
	         f=1;
		     break;
		
		case 4:
	     ob.traverse();
	     f=1;
	     break;
		case 5:
			 f=2;
			 break;
		  
		}}

	}



	}


