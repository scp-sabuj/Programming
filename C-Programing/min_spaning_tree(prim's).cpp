#include<stdio.h>

struct st{
    char f;
    char l;
    int cost;
};

st stA[100];

int main()
{
    int n,mini,temp,source;
    printf("Enter the number of Edge  : ");
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf(" %c %c%d",&stA[i].f,&stA[i].l,&stA[i].cost);
    }
    for(int i=0;i<n;i++)
    {
        printf("%c & %c-->%d\n",stA[i].f,stA[i].l,stA[i].cost);
    }
    printf("Enter the Strating Source : ");
    scanf(" %c",&source);

    return 0;
}
/*mini=stA[0].cost;
    for(int i=1;i<n;i++)
    {
        if(stA[i].cost<mini)
        {
            mini=stA[i].cost;
            temp=i;
        }
    }
    printf("\n\n%c & %c-->%d",stA[temp].f,stA[temp].l,mini);
*/
