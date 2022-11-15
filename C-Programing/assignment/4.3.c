#include<stdio.h>
int main()
{
    int i,j,n,t,k;
    printf("Enter a number=");
    scanf("%d",&n);
    k=t=n*2-1;
    for(i=1;i<=n;i++)
    {
        for(j=0,k--;j<t;j++)
        {
            if(j<i)
                printf("*");
            else if(j>=k)
                printf("*");
            else
                printf(" ");
        }
        printf("\n");
    }
    return 0;
}

