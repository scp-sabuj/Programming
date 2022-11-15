#include<stdio.h>
int reverses(int n);
int rev;
int main()
{
    int a,b,t,sum;
    scanf("%d",&t);
    for( int i=1;i<=t;i++)
    {
        scanf("%d%d",&a,&b);
        a=reverses(a);
        rev=0;
        b=reverses(b);
        rev=0;
        sum=a+b;
        sum=reverses(sum);
        printf("%d\n",sum);
        rev=0;

    }
}

int reverses(int n)
{
    while(n!=0)
    {
        rev=rev*10+(n%10);
        n=n/10;
    }
    return rev;
    rev= 0;
}
