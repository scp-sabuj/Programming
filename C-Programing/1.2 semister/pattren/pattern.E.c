#include <stdio.h>
int main()
{
     int a=1, b=1, c=1, d=1, e=1, n;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    while(a<=n)
    {
        printf("*", a);
        a++;
    }

    while(b<=n)
    {
        printf("*\n", b);
        b++;
    }
    while(c<=n)
    {
        printf("*", c);
        c++;
    }
    while(d<=n)
    {
        printf("*\n", c);
        d++;
    }
    while(e<=(n+1))
    {
        printf("*", e);
        e++;
    }
}
