import java.io.*;
public class PrimeNumbers
{
public static void main(String[]args)throws IOException{
//Create a BufferedReader object to accept data from keyboard
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.println("enter the value of N:");
int num = Integer.parseInt(br.readLine());int count;
for(int i=2;i<=num;i++)
{
count=0;
for(int j=2;j<=i/2;j++)
{
if(i%j==0)
{
count++;
break;
}
}
if(count==0)
System.out.println(i);
}
}
}