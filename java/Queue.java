import java.util.Scanner;
class Queue
{
	static int n;
	static int front=-1,rear=-1;

	static int a[]=new int[100];
	 void Enqueue()
    {
	  if(rear==n-1)
	  {
	    System.out.println("Queue is full");
	  }
	 else
	 {
		for(int i=0;i<n;i++)
		{
			Scanner s=new Scanner(System.in);
			a[i]=s.nextInt();
			rear++;
    	 }
	 return ;
	 }
	}
	void Dequeue()
	{
	  System.out.println("Dequeued element is"+a[++front]);
	  
	}
	void Display()
	{
		if(rear==front)
			System.out.println("Queue is Empty");
		else
		{
			for(int i=front+1;i<=rear;i++)
			{
				System.out.println("Elements are "+a[i]);
			}
		}
	}

   public static void main(String[] args)
   {
     Scanner s=new Scanner(System.in);
	 Queue q=new Queue();
     System.out.println("Enter size of Queue");
     n=s.nextInt();
     	 while(true)
	 {
	 System.out.println("1.Enqueue\n2.Dequeue\n3.Display\n4.Exit");
	 System.out.println("Enter  the Choice");
	 int choice=s.nextInt();
	 switch(choice)
	 {
		 case 1:System.out.println("Enter the num to be inserted:");
		        q.Enqueue();
				break;
		 case 2:q.Dequeue();
		        break;
	     case 3:q.Display();
		        break;
		 case 4:System.exit(0);
	 }		
	 }	 
   } 
}		
