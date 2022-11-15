#include<stdio.h>
#include<math.h>
int main()
{
    int n,t,i=1,a;
    float b;

    scanf("%d",&n);
    while(n--)
    {
        scanf("%d",&a);
        b=sqrt(a);
        t=b;
        b=b-t;
        if(b==0)
        {
            printf("Case %d: YES\n",i);
        }
        else
        {
            printf("Case %d: NO\n",i);
        }
        i++;
    }
    return 0;
}
