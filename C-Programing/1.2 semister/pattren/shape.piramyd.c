#include <stdio.h>
int main()
{
    int j=0, i=0, k=0;
    //printf("Enter the value of n:\n");
    //scanf("%d", &n);
    for(i=0; i<5; i++)
    {
        for(k=0; k<5-i; k++)
        {
            printf("$");

        }
         for(j=0; j<i*2+1; j++)
        {
            printf("*");

        }
        printf("\n");

    }
    return 0;
}
