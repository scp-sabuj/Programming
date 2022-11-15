#include<stdio.h>
int main()
{
    int a[100], j, k, n, i;
    printf("Enter the number of elements\n");
    scanf("%d", &n);
    printf("Enter %d numbers elements\n", n);
    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }
    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n;)
        {
            if(a[j]==a[i])
            {
                for(k=0; k<n; k++)
                {
                    a[k]==a[k+1];
                }
                n--;
            }
            else
                j++;
        }
    }
    for(i=0; i<n; i++)
    {
        printf("%d", a[i]);
    }



    return 0;
}
