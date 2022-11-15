#include<stdio.h>
int main()
{
    int i,j,k,n,m=0,t;
    printf("Enter array Element:");
    scanf("%d",&n);
    int a[n],b[n];
    printf("Enter value:");
    for(i=0;i<n;i++)
        scanf("%d",&a[i]);
    b[0]=a[0];
    for(i=1;i<n;i++)
    {
        for(k=0;k<=m;k++)
        {
            if(a[i]==b[k])
                break;
        }
        if(k>m)
        {
            m++;
            b[m]=a[i];
        }
    }
    for(i=0;i<=m;i++)
    {
        for(k=0;k<i;k++)
        {
            if(b[k]>b[k+1])
                {
                    t=b[k];
                    b[k]=b[k+1];
                    b[k+1]=t;
                }
        }
    }
    for(i=0;i<=m;i++)
        printf("%d ",b[i]);
    return 0;
}
