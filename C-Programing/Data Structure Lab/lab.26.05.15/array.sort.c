#include <stdio.h>
int main()
{
    int i, k, temp, a[100], n;
    printf("Enter number of array:\n");
    scanf("%d",&n);
    printf("Enter array elements:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
    }

    for(i=1; i<n; i++)
    {
        for(k=0; k<n-i; k++)
        {
            if(a[k]>a[k+1]){
               temp=a[k];
               a[k]=a[k+1];
               a[k+1]=temp;
            }
        }
    }

    for(k=0; k<n; k++)
    {
        printf("%d ", a[k]);
    }


    return 0;
}
