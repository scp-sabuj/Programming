#include <stdio.h>
int main()
{
    int n,i;
    printf("enter a number\n");
    scanf("%d",&n);
    for(i=0;i<=100;i++)
    {
        if(n/i==1&&n%i==0&&n/1==n)
            printf("the number is prime");
    }
    printf("the number is not a prime");
    return 0;
}
