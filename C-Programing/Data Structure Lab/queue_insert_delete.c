#include<stdio.h>
int main()
{
    int n,front=-1,rear=-1;
    scanf("%d",&n);
    int ar[n];
    for(;;)
    {
    if(front==1&&rear==n-1)
        {
            printf("over flow\n");
        }
       else if(front==-1)
        {
            front++;
            rear++;
            scanf("%d",&ar[rear]);
        }
        else
        {
            rear++;
            scanf("%d",&ar[rear]);
        }
    }

    return 0;
}
