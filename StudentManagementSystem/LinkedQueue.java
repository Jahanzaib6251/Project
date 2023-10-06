import java.util.NoSuchElementException;

public class LinkedQueue<T> implements QueueInterface<T>
{
	private Node<T> firstNode;
	private Node<T> lastNode;
	
	public LinkedQueue()
	{
		firstNode = null;
		lastNode = null;
	}

	@Override
	public void enqueue(T entry)
	{
		Node<T> newNode = new Node<T>(entry, null);
		
		if(isEmpty())
		{
			firstNode = newNode;
		}
		else
		{
			lastNode.setNextNode(newNode);
		}
		lastNode = newNode;	
	}
	@Override
	public T dequeue()
	{
		T toReturn = getFront();
		
		firstNode = firstNode.getNextNode();
		
		if(firstNode == null)
		{
			lastNode = null;
		}
		
		return toReturn;
		
	
	}
	@Override
	public T getFront()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException("Queue is Empty");
		}
		else
		{
			return firstNode.getData();
		}
	}

	@Override
	public boolean isEmpty()
	{
		return firstNode == null && lastNode ==null;
	}

	@Override
	public void clear()
	{
		firstNode = lastNode = null;
	}
	@SuppressWarnings("hiding")
	private class Node<T>
	{
		private T data;
		private Node<T> nextNode;
		
		public Node(T data,Node<T> nextNode)
		{
			super();
			this.data = data;
			this.nextNode = nextNode;
		}
		public T getData()
		{
			return data;
		}
		@SuppressWarnings("unused")
		public void setData(T data)
		{
			this.data = data;
		}
		public Node<T> getNextNode()
		{
			return nextNode;
		}
		public void setNextNode(Node<T> nextNode)
		{
			this.nextNode = nextNode;
		}
		
		
		
		
		
		
	}

}
