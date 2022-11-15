#include <stdio.h>
int main()
{
    int n, i=0, k=0;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    for(i=1; i<=n; i++)
    {
        for(k=1; k<=n; k++)
        {
            if(i==n||k==n||i<=1||k==1)
            printf(" ");
            else
            printf("*");

        }
        printf("\n");
    }
    return 0;
}
