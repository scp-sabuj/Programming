#include<stdio.h>
int main()
{
    int a[100], j, k, n, i;
    printf("Enter the number of elements");
    scanf("%d", &n);
    printf("Enter %d numbers elements\n", n);
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n; j++)
        {
            if(a[i]==a[j])
                break;

        }
    }
    if(j==n)
        printf("%d\n", a[i]);




    return 0;
}
