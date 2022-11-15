#include <stdio.h>
int main()
{
    int a=0, sum=0, n;
    printf("Enter the value of n:\n");
    scanf("%d", &n);
    while (a<=n)
    {
        //if(n%2==0)
        sum+=a;
        a++;
    }
            printf("%d\n", sum);


    return 0;
}
