#include <stdio.h>
int main()
{
    int n=0, sum=1;
    while(n<=10)
    {
        //if(n%2==1)
        {
            printf("%d+%d=",sum, n);
            sum+=n;
            printf("%d\n", sum);
        }
        n++;
    }
    //sum1
    //printf("")


    return 0;
}
