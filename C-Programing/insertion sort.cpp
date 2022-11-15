#include<stdio.h>
int main()
{
    int n,array[1000],i,d,t;
    printf("Enter number of elements: ");
    scanf("%d",&n);
    printf("Enter integers : \n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&array[i]);
    }
    for(i=1;i<=n-1;i++)
    {
        d=i;
        while(d>0&&array[d]<array[d-1])
        {
            t=array[d];
            array[d]=array[d-1];
            array[d-1]=t;
            d--;
        }
    }
    printf("Sorted list in ascending order: \n");
    for(i=0;i<=n-1;i++)
    {
        printf("%d, ",array[i]);
    }
    return 0;
}
