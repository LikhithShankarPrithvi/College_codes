import java.util.*;
class arrayStack
{
	protected int arr[];
	protected int top, size, len;
	public arrayStack(int n)
	{
		size = n;
		len = 0;
		arr = new int[size];
		top = -1;
	}
	public boolean isEmpty()
	{
		return top == -1;
	}
	public int getSize()
	{
		return len ;
	}
	public void peek()
	{
		if( isEmpty() ){
			System.out.println("Stack is Empty");
			return;
		}
		System.out.println("Peek Element = " + arr[top]);
	}
	public void push(int i)
	{
		if(top + 1 >= size){
			System.out.println("Stack is Full");
			return;
		}
		if(top + 1 < size )
			arr[++top] = i;
		len++ ;
	}
	public void pop()
	{
		if( isEmpty() ){
			System.out.println("Stack is Empty");
			return;
		}
		len-- ;
		System.out.println("Popped Element = " + arr[top--]); 
	}    
	public void display()
	{
		System.out.print("\nStack = ");
		if (len == 0)
		{
			System.out.print(" Empty\n");
			return ;
		}
		for (int i = top; i >= 0; i--)
			System.out.print(arr[i]+" ");
		System.out.println();
	}    
}
public class StackImplement
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);        
		System.out.println("Enter Size of Integer Stack:");
		int n = scan.nextInt();
		arrayStack stk = new arrayStack(n);
		int choice;
		do{
				System.out.println("Stack Operations\n1. push\n2. pop\n3. peek\n4. size\n5. Display");
				choice = scan.nextInt();
				switch (choice)
				{
					case 1 : System.out.println("Enter integer element to push");
						    stk.push( scan.nextInt() );
							break;                         
					case 2 : stk.pop();break;
					case 3 : stk.peek();break;                                        
					case 4 : stk.display();break;                 
					case 5 : System.out.println("Size = " + stk.getSize());break;  
					default : System.out.println("Wrong Entry \n ");
							break;
				}
		}while (choice <= 5 && choice >= 1);                 
	}
}
