#include <stdio.h>
int main()
{
    int i=0,x=0;
    while(i<20)
    {
        if(i%5==0)
        {
            x+=i;
            printf("%d\n",x);
        }
        ++i;
    }
    printf("x=%d\n",x);
    return 0;
}
