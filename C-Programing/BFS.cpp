#include<stdio.h>
#include<vector>
int main()
{
    //vector<int>vectorArr[20];
    int arr[20][20],n;
    char str[20];
    printf("Enter the number of vertex : ");
    scanf("%d",&n);
    printf("Enter the vertex's : \n");
    for(int i=1; i<=n; i++)
    {
        scanf(" %c",&str[i]);
    }
    printf("Enter the Edage's :\n\n");
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {
            printf("Edage between %c and %c is : ",str[i],str[j]);
            scanf("%d",&arr[i][j]);
            printf("\n");
        }
    }
    for(int i=1; i<=n; i++)
    {
        for(int j=1; j<=n; j++)
        {

            if(arr[i][j]!=0)
            {
                printf("Vertex %c and %c has Eadge, that is : %d\n",str[i],str[j],arr[i][j]);
            }
        }
    }
    return 0;
}
