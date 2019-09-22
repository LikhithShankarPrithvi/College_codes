#include<stdio.h>
int main()
{
int x[]={10,20,30,40};
int y[]={10,20,30,40};
int *a=&x[0];
int *b=&y[0];
a++;
++*b;
*a++;
b++;
a++;
*a = *(--b)+(*a--);
b++;
*b = *(--a)+(++*b);
printf("%d\n",x[]);
printf("%d\n",y[]);
}