#include<stdio.h>
int main()
{
    int fst,lst,mid,n,src,i;

    printf("Enter a number:\n");
    scanf("%d",&n);

    int arr[n];

    printf("\nEnter array elements:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("\nEnter search item:\n");
    scanf("%d",&src);

    fst=0;
    lst=n;
    mid=(fst+lst)/2;

    for(i=0;i<=mid;i++)
    {
        if(arr[mid]<src)
            fst=mid+1;
        else if(arr[mid]==src)
        {
            printf("\n%d found at location %d\n",src,mid+1);
            break;
        }
        else
            lst=mid-1;
        mid=(fst+lst)/2;
    }
    if(fst>lst)
        printf("\nNot found! %d is not present in the list",src);


    return 0;
}
