#include <stdio.h>
int main()
{
    int a[100],n,i,sum=0;
    printf("enter the number the array:\n");
    scanf("%d",&n);
    printf("enter rthe elements:\n");
    for(i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        sum=sum+a[i];
    }
    printf("sumatiom=%d",sum);
    return 0;
}
