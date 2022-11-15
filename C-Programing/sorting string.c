#include <stdio.h>
typedef struct
{
    char c[100];
}st;
int main()
{
    int n,i,k;
    printf("Enter string element:");
    scanf("%d",&n);
    st c[n],t;
    printf("Enter %d string:\n",n);
    for(i=0;i<n;i++)
    {
        scanf("%s",&c[i]);
    }
    for(i=0;i<n;i++)
    {
        for(k=0;k<n-i;k++)
        {
            if(c[k].c[0]>c[k+1].c[0])
            {
                t=c[k];
                c[k]=c[k+1];
                c[k+1]=t;
            }
        }
    }
    printf("sorting is:\n");
    for(i=0;i<=n;i++)
    {
        printf("%s\n",c[i].c);
    }
    return 0;
}
