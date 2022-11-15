#include<stdio.h>
int main()
{
    int ar[10],top=0,a,i=0;
    while(scanf("%d",&a)==1)
    {
    if(a==1)
        {
    if(top==10)
            {
    printf("over flow\n");
            }
    else
            {
    scanf("%d",&ar[top]);
    top++;
            }
        }
    else if(a==2)
        {
    if(top==0)
            {
    printf("under flow\n");
            }
    else
            {
    top--;
            }
        }
    else if(a==3)
        {
    for(i=top-1;i>=0;i--)
           {
    printf("%d\n",ar[i]);
           }
        }
    }
    return 0;

}
