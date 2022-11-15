#include<stdio.h>
int main()
{
    int a[100], item, start, end, mid, j, k, n, i,temp;
    printf("Enter the number of elements");
    scanf("%d", &n);
    printf("Enter %d numbers elements\n", n);
    for(i=0;i<n;i++)
    {
        scanf("%d", &a[i]);
    }
    printf("Enter search item:\n");
    scanf("%d", &item);
    start=0;
    end=n-1;
    mid=(start+end)/2;
    while(start<=end)
    {
        if(a[mid]<item)
        start=mid+1;
        else if(a[mid]==item)
        {
            printf("YES! I got it at position %d", mid+1);
            break;
        }
        else
            end=mid-1;
        mid=(start+end)/2;

    }
    if(start>end)
        printf("Item not found.");


    return 0;
}
