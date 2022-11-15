#include <stdio.h>
#include <string.h>
int main()
{
    int a[100],i,n,item;
    printf("Enter the array element numbers:\n");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("Enter the item to find\n");
    scanf("%d",&item);
    for(i=0;i<n;i++)
    {
        if(a[i]==item)
        {
            printf("%d found at location:%d\n",item,i+1);
            break;
        }
    }
    if(i==n)
    {
        printf("%d not found",item);
    }
    return 0;
}
