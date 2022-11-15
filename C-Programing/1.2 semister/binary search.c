#include <stdio.h>
int main()
{
    int i,n,f,l,m,s,a[100];
    printf("enter the element number of array:\n");
    scanf("%d",&n);
    printf("enter the array\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("enter the value to find:\n");
    scanf("%d",&s);
    f=0;
    l=n-1;
    m=(f+l)/2;
    while(f<=l)
    {
        if(a[m]==s)
        {
            printf("%d found at location:%d\n",s,m+1);
            break;
        }
        else if(a[m]<s)
        {
            f=m+1;
        }
        else
        {
            l=m-1;
        }
        m=(f+l)/2;
    }
    if(f>l)
    {
        printf("%d not found in the array\n",s);
    }
    return 0;
}
