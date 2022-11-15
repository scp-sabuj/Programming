#include<stdio.h>
int main()
{
    int a[100],c[100],b[100],maxv,n,i;
    printf("Enter the elements number of array: ");
    scanf("%d",&n);
    printf("Enter elements:\n");
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    maxv=a[0];
    for(i=0; i<n; i++)
    {
        if(a[i]>maxv)
        {
            maxv=a[i];
        }
    }
    for(i=0; i<=maxv; i++)
    {
        c[i]=0;
    }
    for(i=0; i<n; i++)
    {
        c[a[i]]++;
    }
    for(i=0; i<=maxv; i++)
    {
        c[i]=c[i-1]+c[i];
    }
    for(i=n-1; i>=0; i--)
    {
        b[c[a[i]]]=a[i];
        c[a[i]]--;
    }
    printf("After Counting Sort: ");
    for(i=1; i<=n; i++)
    {
        printf("%d, ",b[i]);
    }
    return 0;
}
