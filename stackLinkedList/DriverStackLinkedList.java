package stackLinkedList;

import java.util.Scanner;

import stack.StackArrayList;

public class DriverStackLinkedList {

	public static void main(String[] args) {
		StackLinkedList ob=new StackLinkedList();
		Scanner sc=new Scanner(System.in);
		int choice;
		bool y=true;
		while(y) {
		System.out.println("1.push element\n2.peek element\n3.pop element\n4.traverse array\n5.exit ");
		System.out.println("please enter the choice");
		choice=sc.nextInt();
		switch(choice) {
		case 1: System.out.println("enter the element");
		          y=true;
		         Integer  value1=sc.nextInt();
		         ob.Push(value1);
		           break;
		case 2:System.out.println(" Your present stack is");
                  Integer x=(Integer)ob.peek();
                 y=true;
                  System.out.println("ELEMENT IS"+" "+x);
                  break;
		case 3:
	         Integer y=(Integer)ob.pop();
	         System.out.println("DELETED ELEMENT IS"+y);
	       y=true;
		     break;
		
		case 4:
	     ob.traverse();
	     y=true;
	     break;
		case 5: 
		         y=false;
			 break;
		  
		}}

	}



	}


