package stack;

import stack.BoundException;

public class StackArrayList<DataType>implements Stack<DataType> {

	Integer buffer;
	Integer top;
	Object arr[];
	StackArrayList()
	{
		buffer=3;
		top=-1;
		arr=  new Object[buffer];	
	}
	public void checkIndex() {
		Object arr2[]=new Object[buffer*2];
		for(int i=0;i<=top;i++) {
			arr2[i]=arr[i];
		}
		arr=arr2;
		buffer=buffer*2;
		}
	public void Push(DataType value) {
		if (top==buffer-1) {
			checkIndex();
		}
		arr[++top]=value;
		
	}
	public DataType peek() {
		if(top==-1) {
			BoundException obj=new BoundException();
			obj.PrintError();	
			return null;
		}
		else
			return (DataType)arr[top];
				}
	public DataType pop() {
		if(top==-1) {
			BoundException obj=new BoundException();
			obj.PrintError();	
			return null;
			}
		else {
			 DataType b=(DataType)arr[top];
			 top--;
			 return b;
		}				

	}
	public void traverse() {
		for(int b=0;b<=top;b++) {
			System.out.println(arr[b]);	
			}
		
	}
	
}
