package stackLinkedList;

public class StackLinkedList<DataType>implements Stack<DataType> {
	
	class Node{
		int data;
		Node next;	
	}
	Node top;
	StackLinkedList(){
		top=null;	
	}
	public void Push(DataType value) {/*add new element at 0 position means first node*/ 
		Node new_node=new Node();
		if(new_node==null) {
			System.out.println("Stack is overflow");
		}
		new_node.data=(int)value;
		new_node.next=top;
		top=new_node;
	}
	public int peek() {
		if(top!=null) {
			return  top.data;
		}
		else
		System.out.println("stack is empty");
		return -1;
	}
	public int pop() {/*remove last element means last node*/
		if (top == null) { 
            System.out.print("\nStack is empty"); 
            return -1; 
        } 
		int b=top.data;
	   top=top.next;
	   return b;
	}
	public void traverse() {
        Node temp = top; 
        while (temp != null) { 
        	System.out.println(temp.data+" "); 
            temp = temp.next; 
	}

}}
