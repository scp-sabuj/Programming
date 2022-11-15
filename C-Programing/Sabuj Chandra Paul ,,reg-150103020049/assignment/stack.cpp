#include<stdio.h>
#define Max 50
int main()
{
    int st[Max],top=0,n,i;
    printf("if you want to insert then press '1'\n");
    printf("if you want to delete then press '2'\n");
    printf("if you want to display then press '3'\n");
    while(1)
    {
        scanf("%d",&n);
        if(n==1)
        {
            if(top==Max)
            {
                printf("overflow\n");
            }
            else
            {
                scanf("%d",&st[top]);
                printf("Inserted number is=%d\n",st[top]);
                top++;
            }
        }
        else if(n==2)
        {
            if(top==0)
            {
                printf("underflow\n");
            }
            else
            {
                top--;
                printf("Deleted number is=%d\n",st[top]);
            }
        }
        else if(n==3)
        {
            if(top==0)
            {
                printf("There is no element in stack:\n");
            }
            else
            {
                printf("display:\n");
                for(i=top-1; i>=0; i--)
                {
                    printf("%d\n",st[i]);
                }
            }
        }
    }
    return 0;
}
