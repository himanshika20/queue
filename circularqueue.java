import java.util.*;
public class circularqueue 
{
	int rear=-1,front=-1;
	int maxSize;
	int a[];
	circularqueue(int x)
	{
		maxSize=x;
		a=new int[maxSize];
	}
	public void enqueue(int y)
	{
	if((rear==maxSize-1 && front ==0)||(rear+1==front))
	{
	System.out.println("overflow");	
	}
	else
	{
		if(front==-1)
		{
			rear=0;
			front=0;
		}
		else if(rear==maxSize-1)
		{
			rear=0;
		}
		else
		{
			rear++;
		}
		a[rear]=y;
	}
	}
	public void dequeue()
	{
		if(front==-1)
		{
			System.out.println("underflow");
		}
		int item=a[front];
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else if(front==maxSize-1)
		{
			front=0;
		}
		else
		{
			front++;
		}
			System.out.println(item);
	}
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("size of array");
	int size=s.nextInt();
	circularqueue c=new circularqueue(size);
	int m;
	do
	{
		m=s.nextInt();
		switch(m)
		{
		case 1:
			c.enqueue(s.nextInt());
			break;
		case 2:
			c.dequeue();
			break;
		case 3:
			c.display();
		case 0:
			break;
			default:
				System.out.println("invalid number");
		}
	}
	while(m!=0);
	}
}
