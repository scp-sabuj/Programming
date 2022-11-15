#include <stdio.h>
void prime(int i,int n)
{
    int k;
    for(i;i<=n;i++)
    {
        for(k=2;k<i;k++)
        {
            if(i%k==0)
            {
                break;
            }
        }
        if(k==i)
            printf("%d ",i);
    }
    return;
}
int main()
{
    int i,n,t;
    printf("enter two number:\n");
    scanf("%d%d",&i,&n);
    /*if(i>n)
    {
        t=i;
        i=n;
        n=t;
    }*/
    prime(i,n);
    return 0;
}
