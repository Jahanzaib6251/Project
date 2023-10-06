public class Node<T>
{
	private T data;
	@SuppressWarnings("rawtypes")
	private Node nextNode;
	
	
	public Node(T data)
	{
		this.data = data;
		this.nextNode = null;
	}
	public T getData()
	{
		return data;
	}
	public void setData(T data)
	{
		this.data = data;
	}
	@SuppressWarnings("rawtypes")
	public Node getNextNode()
	{
		return nextNode;
	}
	@SuppressWarnings("rawtypes")
	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
	}
	
	
}
