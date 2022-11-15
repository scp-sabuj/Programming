#include <stdio.h>
int main()
{
     int a=1, b=1, n;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    while(a<=(n-1))
    {
        printf("*\n", a);
        a++;
    }
    while(b<=n)
    {
        printf("* ", b);
        b++;
    }
}
