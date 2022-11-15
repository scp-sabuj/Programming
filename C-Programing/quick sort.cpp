#include <stdio.h>
void quicksort( int [10], int , int );
int main()
{
    int arr[20],size,i;
    printf("Enter size of the array: " );
    scanf("%d",&size);
    printf("Enter elements:\n");
    for (i=0; i<size; i++)
    {
        scanf("%d",&arr[i]);
    }
    quicksort(arr,0,size-1);
    printf("Sorted elements: " );
    for (i=0; i<size; i++)
    {
        printf("%d, ",arr[i]);
    }
    return 0;
}
void quicksort( int arr[10], int first, int last)
{
    int pivot,j,temp,i;
    if (first<last)
    {
        pivot=first;
        i=first;
        j=last;
        while (i<j)
        {
            while (arr[i]<=arr[pivot]&&i<last)
                i++;
            while (arr[j]>arr[pivot])
                j--;
            if (i<j)
            {
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        temp=arr[pivot];
        arr[pivot]=arr[j];
        arr[j]=temp;
        quicksort(arr,first,j-1);
        quicksort(arr,j+1,last);
    }
}
