#include <stdio.h>
int main()
{
    int n ,i,j;
    printf("Enter the element number:\n");
    scanf("%d",&n);
    printf("The prime numbers are:\n");
    for(i=2.;i<=n;i++)
    {
        for(j=2;j<i;j++)
        {
            if(i%j==0)
            {
                break;
            }
        }
    if(i==j)
        {
            printf("%d ",i);
        }
    }
    return 0;
}
