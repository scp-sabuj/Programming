#include <stdio.h>
int main()
{
    int st[100],top=0,i,n;
    for(;;)
    {
        printf("Enter the array element number:\n");
        scanf("%d",&n);
        printf("Enter the elements:\n");
        for(i=0;i<n;i++)
        {
            scanf("%d",&st[i]);
        }
        printf("Stack of the array:\n");
        for(i=n-1;i>=0;i--)
        {
            printf("%d\n",st[i]);
        }
    }
    return 0;
}
