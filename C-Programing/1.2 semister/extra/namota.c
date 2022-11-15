#include <stdio.h>
int main()
{
    int a, i=1;
    printf("Enter the value of a\n");
    scanf("%d", &a);
    while(i<=10)
    {
        printf("%dX%d=%d\n", a, i, a*i);
        i++;
    }




    return 0;
}
