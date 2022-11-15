#include <stdio.h>
int main()
{
     int a=1, n;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    while(a<=n)
    {
        printf("*\n", a);

        a++;
    }
    printf("*", a);
}
