#include <stdio.h>
int main()
{
    int a[50],s,i,max,min;
    printf("Enter the size of the array:\n");
    scanf("%d",&s);
    printf("Enter %d elements in the array:\n",s);
    for(i=0;i<s;i++)
    {
        scanf("%d",&a[i]);
    }
    max=a[0];
    for(i=1; i<s; i++)
    {
        if(max<a[i])
        {
            max=a[i];
        }
    }
    printf("Maximum value: %d\n",max);

    min=a[0];
    for(i=1; i<s; i++)
    {
        if(min>a[i])
        {
            min=a[i];
        }
    }
    printf("Minimum value: %d\n", min);

    return 0;
}

