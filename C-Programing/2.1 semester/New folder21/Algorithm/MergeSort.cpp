#include<stdio.h>

void Merge(int p,int q,int r);
void MergeSort(int p ,int r);

int arr[100];

int main()
{
    int n;

    while(true)
    {
        printf("Enter the number of elements :\n");
        scanf("%d",&n);
        printf("Enter the number : \n");
        for(int i=0;i<n;i++)
        {
            scanf("%d",&arr[i]);
        }
        MergeSort(0,n-1);
        printf("Sorted List : ");
        for(int i=0;i<n;i++)
        {
            printf("%d, ",arr[i]);
        }
        printf("\n\n");
    }
}

void Merge(int p,int q,int r)
{
    int n1 = q-p+1;
    int n2 = r-q;
    int left[100],right[100];
    for(int i=0;i<n1;i++) left[i] = arr[p+i];
    for(int i=0;i<n2;i++) right[i] = arr[q+i+1];
    int i=0, j=0;
    left[n1] = 100;
    right[n2] = 100;
    for(int k=p;k<=r;k++)
    {
        if(left[i]<=right[j])
        {
            arr[k] = left[i];
            i++;
        }
        else
        {
            arr[k] = right[j];
            j++;
        }
    }

}

void MergeSort(int p ,int r)
{
    if(p<r)
    {
        int q = (p+r)/2;
        MergeSort(p,q);
        MergeSort(q+1,r);
        Merge(p,q,r);
    }
}
