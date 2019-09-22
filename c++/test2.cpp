#include<iostream>
using namespace std;
int num(int a[], int n, int k)
{
    cin>>n;
    for (int i=0;i<n;i++)
    {
        cin>>a[i];
    }
    cout<<"\n";
    cin>>k;
    int count=0;
    for(int i=0;i<n;i++)
    {
        int x=a[i];
        while(x!=0)
        {
            if(x%10==k)
            {
                count++;
            }
            x=x/10;
        }
    }
    cout<<count<<endl;
}
int main()
{
    cout<<num();
    return 0;
}
