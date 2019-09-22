#include <iostream>
using namespace std;

int main() {
    int t;
	cin>>t;
	long a[t];
	for (int i=0;i<t;i++)
	{
	    long n;
	    cin>>n;
	    int p=0;
	    while(p!=3)
	    {
	        n++;
	        long x=n;
	        int count=0;
	        while(x!=0)
	        {
	            long y=x%10;
	            if(y==3)
                {
                    count++;
                }
	            x=x/10;
	        }
	        p=count;
	    }
	    cout<<n<<"\n";
	}
	return 0;
}
