#include<stdio.h>
int main()
{
    int coin[100],n,a,arr[1000],temp;
    printf("Enter the coin number : ");
    scanf("%d",&n);
    printf("Enter the coins : ");
    for(int i=1;i<=n;i++)
    {
        scanf("%d",&coin[i]);
    }
    printf("Enter the Amount : ");
    scanf("%d",&a);
    for(int i=0;i<=a;i++)
    {
        if(i==0)
        {
            arr[i]=1;
        }
        else
        {
            arr[i]=0;
        }
    }
    for(int i=1;i<=n;i++)
    {
        for(int j=0;j<=a;j++)
        {
             if(arr[j]!=0)
             {
                 arr[j+coin[i]]=arr[j]+arr[j+coin[i]];
             }
        }
    }
    printf("NUMBER OF WAY TO MAKE %d IS : %d",a,arr[a]);
    return 0;
}
