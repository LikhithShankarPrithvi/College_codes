import java.util.Scanner;
class Factorial{
static int factorial(int n){
if(n==0)
return 1;
else
return(n*factorial(n-1));
}
public static void main(String args[]){
int i,fact=1;
System.out.println("enter the number");
Scanner in = new Scanner(System.in);
int number=in.nextInt();
fact=factorial(number);
System.out.println("factorial of "+number+"is:"+fact);
}
}
