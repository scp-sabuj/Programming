#include <stdio.h>
int main()
{
    int arr[100],n,i,j,temp;
    printf("Enter the array element number:\n");\
    scanf("%d",&n);
    printf("Enter the array element\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        {
            if(arr[j]>arr[j+1])
            {
                temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printf("Sort by Ascending:");
    for(i=0;i<n;i++)
    {
        printf("%d ",arr[i]);
    }
    printf("\nSort by desceding:");
    for(i=n-1;i>=0;i--)
    {
        printf("%d ",arr[i]);
    }
    return 0;
}
