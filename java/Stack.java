import java.util.Scanner;
class Stack{
int top;
int a[]=newInt[10];
Stack()
{
top=-1;
}
void push(int x){
top++;
a[top]=x;
}
int pop(){
return a[top=-1];
}
void display(){
for(int i=0;i<=top;i++){
System.out.println(a[i]);
}
}
}
class Stacktest{
public static void main(String args[]){
Stack S = newStack();
Scanner s =new Scanner(System.in);
int k;
loop1:while(true){
System.out.println("1.push\n 2.pop\n 3.display\n 4.exit\n");
k=s.nextInt();
loop2:switch(k){
case 1:System.out.println("enter no to push");
int d;
d=S.nextInt();
S.push(d);
break;
case 2:System.out.println(S.pop()+"is deleted");
S.pop();
break;
case 3:S.display();
break;
case 4:break loop1;
default:System.out.println("invalid choice");
break;
}
}
}
}
