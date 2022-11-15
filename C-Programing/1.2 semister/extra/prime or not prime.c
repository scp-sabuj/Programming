#include <stdio.h>
int main()
{
    int n,i;
    printf("enter the number:");
    scanf("%d",&n);
    if(n==1||n==0)
    {
        printf("not prime\n");
    }
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            printf("not prime");
            break;
        }
    }
    if(i==n)
        printf("prime");
    return 0;
}

