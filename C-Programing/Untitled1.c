#include<stdio.h>
int main()
{
    int a[10],i,j,temp,n,total=0,dec;
    printf("Enter the renge of array: \n");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&a[i]);
    }
    while(n!=1)
    {
        for(i=0; i<n; i++)
        {
            for(j=0; j<i; j++)
            {
                if(a[i]<a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        printf("\n\n");
        for(i=0; i<n; i++)
        {
            printf("%d\n",a[i]);
        }
        total=a[0]+a[1];
        dec=1;
        a[0]=total;
        for(i=1; i<n-1; i++)
        {
            dec++;
            a[i]=a[dec];
        }
        n--;
    }
    printf("Total = %d",a[0]);
    return 0;
}
