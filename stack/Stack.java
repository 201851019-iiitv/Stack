package stack;

public interface Stack<DataType>{
	public void Push(DataType value);
	public DataType peek();
	public DataType pop();
	public void traverse();
}
