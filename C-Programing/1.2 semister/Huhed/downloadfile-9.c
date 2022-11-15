#include <stdio.h>
void array_print(int arr[],int n)
{
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d\n",arr[i]);
    }
    return;
}
int main()
{
    int i,arr[100],n;
    printf("Enter array of element=");
    scanf("%d",&n);
    printf("Enter array eliment:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d ",&arr[i]);
    }
    array_print(arr,n);
    return 0;
}
