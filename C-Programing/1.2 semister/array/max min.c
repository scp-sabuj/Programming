#include <stdio.h>
int main()
{
    int a[100],n,i,max,min;
    printf("enter the array limitation number:");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    for(i=0;i<n;i++)
    {
        printf("%d\n",a[i]);
    }
    max=a[0];
    for(i=1;i<n;i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    printf("maximum=%d\n",max);
    return 0;
}
