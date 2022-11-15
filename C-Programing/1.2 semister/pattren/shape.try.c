#include <stdio.h>
int main()
{
    int i=0, k=0;
    //printf("Enter the value of n:\n");
    //scanf("%d", &n);
    for(i=0; i<=5; i++)
    {
        for(k=1; k<=i; k++)
        {
            printf("*");
            //printf("*");
        }
        printf("\n");

    }
    for(i=0; i<=5; i++)
    {
        for(k=0; k<=5-i; k++)
        {
            printf("*");
            //printf("*");
        }
        printf("\n");

    }
    for(i=0; i<=5; i++)
    {
        for(k=1; k<=i; k++)
        {
            printf("*");
            //printf("*");
        }
        printf("\n");

    }
    for(i=0; i<=5; i++)
    {
        for(k=0; k<=5-i; k++)
        {
            printf("*");
            //printf("*");
        }
        printf("\n");

    }
    return 0;
}
