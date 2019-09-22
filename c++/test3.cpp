#include<iostream>
using namespace std;
int fib(int a)
{
    int i;
    if (a==2 || a==3)
    {
        return 1;
    }
    else
    {
        i=fib(a-1)+fib(a-2);
        return(i);
    }
}
int main()
{
    int t;
    cin>>t;
    for(int i=0;i<t;i++)
    {
    int l,r;
    cin>>l>>r;
    int f;
    int sum=0;
    while(l!=r)
    {
        int f=fib(l);
        l++;
        int g=0,n=0;
        while(f!=0 && n!=4)
        {
            g=(g*10)+(f%10);
            f=f/10;
            n++;
        }
        sum=sum+g;
    }
    cout<<sum<<endl;
    }
}
