#include<stdio.h>

int main()
{
    int t, a,c=0;

    scanf("%d",&t);

    while(t--)
    {
        scanf("%d",&a);
        if(a==0)
        {
            c=c+1;
        }

        while(a!=0)
        {
            a=a/10;
            c++;
        }
        printf("%d\n", c);
        c=0;
    }

    return 0;
}
