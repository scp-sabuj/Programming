#include<stdio.h>
int main()
{
    int n;
    double a,b;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%lf%lf",&a,&b);
        a=a*2;
        b=b*(1.4142);
        int x=a;
        int y=b;
        if(x==y)
        {
            printf("Yes\n");
        }
        else
        {
            printf("No\n");
        }
    }
}
