#include <stdio.h>
#define MAX 50
int rear=-1,front=-1;
void ins(int queuep[],int item);
void del(int queuep[]);
main()
{
    int queuep[MAX],i,n,t;
    printf("Enter the queue element's number:\n");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&t);
        ins(queuep,t);
    }
    printf("\n\n\n");
    for(i=n-1; i>=0; i--)
    {
        del(queuep);
    }
}
void ins(int queuep[],int item)
{
    if(front==-1&&rear==MAX-1)
    {
        printf("Overfollow\n");
        return;
    }
    else
    {
        queuep[++rear]=item;
        printf("Value inserted in queue is:%d\n",item);
        front=1;
    }
}
void del(int queuep[])
{
    int val;
    if(front==NULL)
    {
        printf("Underfollow\n");
        return;
    }
    else
    {
        val=queuep[front-1];
        ++front;
    }
    printf( "Value deleted from queue is:%d\n\n",val);
}
