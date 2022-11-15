#include <stdio.h>
int main()
{
    int arr[100],i,n,sum=0,average;
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

    for(i=0;i<n;i++)
    {
        sum=sum+arr[i];
    }
    printf("sum=%d\n",sum);
    average=sum/n;
    printf("average=%d\n",average);
    return 0;
}
