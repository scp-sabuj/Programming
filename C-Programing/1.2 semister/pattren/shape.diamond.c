#include <stdio.h>
int main()
{
    int j=0, i=0, k=0;
    //printf("Enter the value of n:\n");
    //scanf("%d", &n);
    for(i=0; i<6; i++)
    {
        for(k=0; k<5-i; k++)
        {
            printf(" ");

        }
         for(j=0; j<i*2+1; j++)
        {
            printf("*");

        }
        printf("\n");

    }
    for(i=0; i<4; i++)
    {
        for(k=0; k<11; k++)
        {
            printf("*");

        }
         for(j=0; j<5-i; j++)
        {
            printf(" ");

        }
        printf("\n");

    }
    return 0;
}
