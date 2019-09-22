import java.util.*;
class CQueue
{
	protected int arr[];
	protected int front, rear, size;
	public CQueue(int n)
	{
		size = n;
		arr = new int[size];
		front = -1; rear = -1;
	}
	public boolean isEmpty()
	{
		return front == -1;
	}
	public boolean isFull()
	{
		return front == (rear+1)%size;
	}
	public void front()
	{
		if( isEmpty() ){
			System.out.println("Circular Queue is Empty");
			return;
		}
		System.out.println("Front Element = " + arr[front]);
	}
	public void rear()
	{
		if( isEmpty() ){
			System.out.println("Circular Queue is Empty");
			return;
		}
		System.out.println("Rear Element = " + arr[rear]);
	}
	public void enqueue(int i)
	{
		if(isFull()){
			System.out.println("Circular Queue is Full");
			return;
		}
		if(isEmpty())
			front = rear = 0;
		else
			rear = (rear+1)%size;
		arr[rear] = i;
	}
	public void dequeue()
	{
		if( isEmpty() ){
			System.out.println("Circular Queue is Empty");
			return;
		}
		int item = arr[front];
		if(rear == front)
			front = rear = -1;
		else
			front = (front+1)%size;
		System.out.println("Deleted Element = " + item);
	}    
	public void display()
	{
		if (isEmpty())
		{
			System.out.print("Circular Queue is Empty");
			return ;
		}
		System.out.println("Elements in Circular Queue is ");
		if(front<=rear){
			for(int i=front;i<=rear;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
		else
		{
			for(int i=0;i<=rear;i++)
				System.out.print(arr[i]+" ");
			for(int i=front;i<size;i++)
				System.out.print(arr[i]+" ");
			System.out.println();
		}
	}    
}
public class CircularQ
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);        
		System.out.println("Enter Size of Integer CircularQ:");
		int n = scan.nextInt();
		CQueue cq = new CQueue(n);
		int choice;
		do{
				System.out.println("CircularQ Operations\n1. Enqueue\n2. Dequeue\n3. front\n4. rear\n5. Display");
				choice = scan.nextInt();
				switch (choice)
				{
					case 1 : System.out.println("Enter integer element to insert");
						    cq.enqueue( scan.nextInt() );
							break;                         
					case 2 : cq.dequeue();break;
					case 3 : cq.front();break;                                        
					case 5 : cq.display();break;                 
					case 4 : cq.rear();break;                         
					default : System.out.println("Wrong Entry \n ");
							break;
				}
		}while (choice <= 5 && choice >= 1);                 
	}
}
