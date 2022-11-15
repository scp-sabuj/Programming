#include<stdio.h>
int main ()
{
    int n,x,i;
    printf("enter a number:\n");
    scanf("%d",&n);
    x=n;
    i=0;
    while(x!=0)
    {
        i=i*10+(x%10);
        x=x/10;
    }
    if(i==n)
        {
            printf("%d is a palindrome number\n",n);
        }
    else
        {
            printf("%d is not a palindrome number\n",n);
        }
    return 0;
}
