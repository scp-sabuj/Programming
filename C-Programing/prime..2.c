#include <stdio.h>
void prime(int i,int j);
int main()
{
    int i,j;
    printf("enter the intervals between i and j:\n");
    scanf("%d%d",&i,&j);
    prime(i,j);
    return 0;
}
void prime(int i,int j)
{
    int k;
    for(i;i<=j;i++)
    {
        for(k=2;k<i;k++)
        {
            if(i%k==0)
            {
               break;
            }
        }
        if(i/k==1)
        {
            printf("%d ",i);
        }
    }
    return;

}
