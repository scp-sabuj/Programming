#include<stdio.h>
int main()
{
    int n,a1,a2,a3,b1,b2,b3,i=1,m1,m2,l1,l2;
    scanf("%d",&n);
    while(n--)
    {
        scanf("%d%d%d",&a1,&a2,&a3);
        scanf("%d%d%d",&b1,&b2,&b3);
        if((a1<a2)&&(a2<a3))
        {
            m1=a3;
            l1=a1;
        }
        else if((a2<a1)&&(a1<a3))
        {
            m1=a3;
            l1=a2;
        }
        else if((a1<a3)&&(a3<a2))
        {
            m1=a2;
            l1=a1;
        }
        else if((a3<a1)&&(a1<a2))
        {
            m1=a2;
            l1=a3;
        }
        else if((a3<a2)&&(a2<a1))
        {
            m1=a1;
            l1=a3;
        }
        else
        {
            m1=a1;
            l1=a2;
        }
        if((b1<b2)&&(b2<b3))
        {
            m2=b3;
            l2=b1;
        }
        else if((b2<b1)&&(b1<b3))
        {
            m2=b3;
            l2=b2;
        }
        else if((b1<b3)&&(b3<b2))
        {
            m2=b2;
            l2=b1;
        }
        else if((b3<b1)&&(b1<b2))
        {
            m2=b2;
            l2=b3;
        }
        else if((b3<b2)&&(b2<b1))
        {
            m2=b1;
            l2=b3;
        }
        else
        {
            m2=b1;
            l2=b2;
        }
        if(m1<l2)
        {
            printf("Case %d: Shibli wins\n",i);
        }
        else if(m2<l1)
        {
            printf("Case %d: Swapnil wins\n",i);
        }
        else
        {
            printf("Case %d: Both can win\n",i);
        }
        i++;
    }
    return 0;
}
