#include <stdio.h>
int main()
{
    int a[100],n,i,m1,m2,temp;
    printf("enter the array element number:\n");
    scanf("%d",&n);
    printf("enter the array:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    printf("the array are:\n");
    for(i=0; i<n; i++)
    {
        printf("%d\n",a[i]);
    }
    m1=a[0];
    m2=a[1];
    if(m2<m1)
    {
        temp=m1;
        m1=m2;
        m2=temp;
    }
    for(i=2; i<n; i++)
    {
        if(a[i]<m1)
        {
            temp=m1;
            m1=a[i];
            m2=temp;
        }
        else if(a[i]<m2)
        {
            m2=a[i];
        }
    }
    printf("first minimum=%d\nsecond minimum=%d",m1,m2);
    return 0;
}
