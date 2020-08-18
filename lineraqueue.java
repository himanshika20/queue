import java.util.*;
public class lineraqueue 
{
	int rear=-1,front=0;
	int maxSize=100;
	int qa[]=new int[maxSize];
	public void enqueue(int x)
	{
		if(isFull())
		{
			System.out.println("overflow");
		}
		else 
		{
			rear++;
			qa[rear]=x;
		}
	}
	public void dequeue()
	{
		if(isEmpty())
		{
			System.out.println("underflow");
		}
		else
		{
			int item;
			item=qa[front];
			front++;
			System.out.println(item+"is popped out");
		}
	}
	public void display()
	{
		for(int i=front;i<=rear;i++)
		{
			System.out.println(qa[i]);
		}
	}
	public boolean isFull()
	{
		if(rear==maxSize-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public boolean isEmpty()
	{
		if(front<0||front>rear)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public void peek()
	{
		if(isEmpty())
		{
			System.out.println("queue is Empty");
		}
		else
		{
			int item;
			item=qa[front];
			System.out.println(item+"is front element");
		}
	}
	public void bottom()
	{
		if(isEmpty())
		{
			System.out.println("queue is Empty");
		}
		else
		{
			int item;
			item=qa[rear];
			System.out.println(item+"is rear element");
		}
	}
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		lineraqueue lq=new lineraqueue();
		int n=s.nextInt();
		while(n!=0)
		{
			int m=s.nextInt();
			switch(m)
			{
			case 1:
				int x=s.nextInt();
				lq.enqueue(x);
				break;
			case 2:
				lq.dequeue();
				break;
			case 3:
				lq.display();
				break;
			case 4:
				lq.peek();
				break;
			case 5:
				lq.bottom();
				break;
				default :
					System.out.println("invalid number");
			}
			n--;
		}
	}
}
