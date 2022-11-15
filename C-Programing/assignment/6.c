#include <stdio.h>
int main()
{
    int i,j,k,ar,ac,br,bc,sum;
    printf("Enter 1st matric row size:");
    scanf("%d",&ar);
    printf("Enter 1st matric colamn size:");
    scanf("%d",&ac);
    printf("Enter 2ed matric row size:");
    scanf("%d",&br);
    printf("Enter 2ed matric colamn size:");
    scanf("%d",&bc);

    int a[ar][ac],b[br][bc],c[ar][bc];

    printf("Enter 1st ..... value:\n");
    for(i=0;i<ar;i++)
    {
        for(k=0;k<ac;k++)
        {
            scanf("%d",&a[i][k]);
        }
        printf("\n");
    }
    printf("Enter 2ed.....value:\n");
    for(i=0;i<br;i++)
    {
        for(k=0;k<bc;k++)
        {
            scanf("%d",&b[i][k]);
        }
        printf("\n");
    }

    if(ar!=bc)
        printf("Error multiplication");
    else
    {
        for(i=0;i<ar;i++)
        {
            for(k=0;k<bc;k++)
            {
                sum=0;
                for(j=0;j<ac;j++)
                {
                    sum+=a[i][j]*b[j][k];
                    c[i][k]=sum;
                }
            }
        }
        printf("multiplection value is:\n");
    for(i=0;i<ar;i++)
    {
        for(k=0;k<ac;k++)
        {
            printf("%d ",c[i][k]);
        }
        printf("\n");
    }
    }

    return 0;
}
