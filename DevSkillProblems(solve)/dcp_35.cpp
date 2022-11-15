#include<stdio.h>
int main()
{
    int t, n=0, a, m=0;
    scanf("%d",&t);

    while(t--)
    {
        scanf("%d",&a);

        while(a>m)
        {
            m++;
            n=n*n;

            if(n==a)
            {
                printf("Case %d: YES\n",t+1);
                break;
            }
            n++;

        }
        if(a==m)
        {
            printf("Case %d: NO\n",t+1);
        }


    }


    return 0;
}
