import java.util.Scanner;
class Prime{
public static void main(String args[]);
int n,i,j,count=0;
Scanner S = new Scanner(System.in);
System.out.println("enter range");
n = S.nextInt();
for(i=0;i<=n;i++)
{
int fact=0;
for(j=2;j<i;j++)
{
if(i%j==0)
p=1;
}
if(p==0)
System.out.println("numbers are"+i);
}
}