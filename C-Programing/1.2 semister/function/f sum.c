#include <stdio.h>
int sum(int a,int b)
{
    int sum;
    sum=a+b;
    return (sum);
}
int main()
{
    int x=5,y=7,z;
    z=sum(x,y);
    printf("sum=%d",z);
    return 0;
}
