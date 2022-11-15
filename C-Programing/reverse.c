#include <stdio.h>
int main()
{
    int n,rev=0,temp;
    printf("Enter the number:");
    scanf("%d",&n);
    temp=n;
    while(n!=0)
    {
        rev=rev*10+(n%10);
        n=n/10;
    }
     printf("reverse=%d\n",rev);
     if(temp==rev)
     {
         printf("The number is Palindrome");
     }
     else
     {
         printf("The number is not palindrome");
     }
    return 0;
}
