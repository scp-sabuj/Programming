#include<stdio.h>
int main()
{
    int arr[100],coin[100],sum=0,i,j,n,other[100],diff[100];
    printf("Enter the number of coin:\n");
    scanf("%d",&n);
    printf("Enter the coins : \n");
    for(int i=1; i<=n; i++)
    {
        scanf("%d",&coin[i]);
        sum=sum+coin[i];
    }
    for(int i=0; i<=sum; i++)
    {
        arr[i]=0;
    }
    arr[0]=1;
    for(i=1; i<=n; i++)
    {
        for(int j=sum; j>=0; j--)
        {
            if(arr[j]==1)
            {
                arr[j+coin[i]]=1;
            }
        }
    }
    int k=0,no;
    for(i=1; i<=sum/2; i++)
    {
        if(arr[i]==1)
        {
            other[k]=sum-i;
            diff[k]=other[k]-i;
            no=k++;

        }
    }
    for(i=0; i<=no; i++)
    {
        for(j=i+1; j<=no; j++)
        {
            if(diff[i]>diff[j])
            {
                int temp=diff[i];
                diff[i]=diff[j];
                diff[j]=temp;
            }
        }
    }
    printf("\n\nMinimum Different : %d \n\n",diff[0]);
    return 0;
}
