#include<stdio.h>
int main()
{
    int i,n,t,k;
    printf("Enter array element:");
    scanf("%d",&n);
    int arr[n];
    printf("Enter array value:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        for(k=0;k<n;k++)
        {

            if(arr[k]>arr[k+1])
            {
                t=arr[k];
                arr[k]=arr[k+1];
                arr[k+1]=t;
            }
        }
    }
    printf("SORT ASCENDING...\n");

    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }

    printf("\nSORT DESCENDING...\n");

    for(n-=1;n>=0;n--)
    {
        printf("%d ",arr[n]);
    }
    return 0;
}
