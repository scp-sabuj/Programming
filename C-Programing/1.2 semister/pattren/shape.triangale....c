#include <stdio.h>
int main()
{
    int n, i=0, k=0;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    for(i=1; i<=n; i++)
    {
        for(k=1; k<=i; k++)
        {
            printf("*");

        }
        printf("\n");

    }
    return 0;
}
