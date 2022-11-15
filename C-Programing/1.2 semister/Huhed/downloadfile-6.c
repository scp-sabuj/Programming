#include<stdio.h>
int main ()
{
    int n,x,y,i;
    printf("enter a palindrome number\n");
    scanf("%d",&n);
    x=n;
    i=0;
    while(x!=0)
    {
        y=x%10;
        i=i*10+y;
        x=x/10;
    }
    if(i==n)
        printf("%d is a palindrome number\n",n);
    else
        printf("%d is not a palindrome number\n",n);
    return 0;
}
