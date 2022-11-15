#include <stdio.h>
int sum(int n)
{
    int i,a=0;
    for(i=0;i<=n;i++)
    {
        a+=i;
    }
    return a;
}
int main()
{
    int a,n;
    printf("Enter a nvalur");
    scanf("%d",&a);
    n=sum(a);
    printf("sum is=%d",n);
    return 0;
}
