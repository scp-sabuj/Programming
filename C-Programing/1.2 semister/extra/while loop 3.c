#include <stdio.h>
int main()
{
    int n=0;
    while(n<100)
    {
        printf("%d\n",n);
        //n=n+1;
        n++;
        if(n>=10)
        {
            break;
        }
        //printf("%d\n",n);
    }
    return 0;
}
