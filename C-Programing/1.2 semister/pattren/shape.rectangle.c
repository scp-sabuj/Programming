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
            printf("*", i);
        }
        printf("\n", k);
    }
    return 0;
}
