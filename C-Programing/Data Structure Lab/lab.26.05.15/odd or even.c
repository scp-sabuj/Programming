#include<stdio.h>
int main()
{
    int n, i;
    printf("Enter your number to find even number");
    scanf("%d", &n);

    if(n%2==0)
            printf("Your number is an even number");
        else
            printf("Your number is an odd number");


    return 0;
}
