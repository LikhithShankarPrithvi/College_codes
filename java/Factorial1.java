import java.util.Scanner;
class Factorial1{  
	static int factorial(int n){
		if (n == 0)
			return 1;    
		else
			return(n * factorial(n-1));
	}
	public static void main(String args[]){
		int i,fact=1;
		System.out.println("Enter the number to find factorial");
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();//It is the number to calculate factorial
		fact = factorial(n);
		System.out.println("Factorial of "+n+" is: "+fact);
	}
}
