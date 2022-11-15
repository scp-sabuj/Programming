#include <stdio.h>
int main()
{
    int arr[100],i,n,item;
    printf("enter a number\n");
    scanf("%d",&n);
    printf("enter arry valus\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);

    }
    for(i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }
    printf("enter the item\n");
    scanf("%d",&item);
    for(i=0;i<n;i++)
    {
        if(item==arr[i])
        {
            printf("item foumd position=%d\n",i);
            break;
        }
    }
    if(n==i)
       {
            printf("item not found\n");
       }
    return 0;
}
