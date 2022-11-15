#include <stdio.h>
int main()
{
    int a[100],n,i,s;
    printf("enter the element number of array:\n");
    scanf("%d",&n);
    printf("enter the element:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }
    printf("enter the search elemet:\n");
    scanf("%d",&s);
    for(i=0;i<n;i++)
    {
        if(s==a[i])
        {
            printf("Item found in possition=%d",i+1);
            break;
        }
    }
    if(s!=a[i])
    {
        printf("Item not found");
    }
    return 0;
}
