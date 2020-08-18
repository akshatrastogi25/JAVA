import java.util.*;


class Queue 
{
	 int arr[];  		
	 int front;  		
     int rear;   		
	int capacity;   	
	 int count;  		
	
	
	Queue(int size)
	{
		arr = new int[size];
		capacity = size;
		front = 0;
		rear = -1;
		count = 0;
    }
    
    public int size()
	{
		return count;
	}
	public Boolean isEmpty()
	{
		return (size() == 0);
	}

	public Boolean isFull()
	{
		return (size() == capacity);
	}

	public void dequeue()
	{
		// check for queue underflow
		if (isEmpty())
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Removing " + arr[front]);

		front = (front + 1) % capacity;
		count--;
	}

	public void enqueue(int item)
	{
		// check for queue overflow
		if (isFull())
		{
			System.out.println("OverFlow\nProgram Terminated");
			System.exit(1);
		}

		System.out.println("Inserting " + item);

		rear = (rear + 1) % capacity;
		arr[rear] = item;
		count++;
	}

	public int peek()
	{
		if (isEmpty()) 
		{
			System.out.println("UnderFlow\nProgram Terminated");
			System.exit(1);
		}
		return arr[front];
	}
	
	public static void main (String[] args)
	{
		Queue q = new Queue(10);

		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(70);
        q.enqueue(80);
		System.out.println("Front element is: " + q.peek());
		q.dequeue();
		System.out.println("Front element is: " + q.peek());

		System.out.println("Queue size is " + q.size());

		q.dequeue();
		q.dequeue();
        q.dequeue();
		
		if (q.isEmpty())
			System.out.println("Queue Is Empty");
		else
			System.out.println("Queue Is Not Empty");
	}
}