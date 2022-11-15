#include <stdio.h>
#include <conio.h>
#define MAX 50
int queue_a[MAX],front=-1,rear=-1;
int insert_q(),delete_q(),display_q();
main()
{
    int choice;
    while(1)
    {
        printf("1.Insert element to queue\n");
        printf("2.Delete elements from queue\n");
        printf("3.Display all elements of queue\n");
        printf("4.Quit\n");
        printf("Enter your choice:\n");
        scanf("%d",&choice);
        switch(choice)
        {
            case 1:
                insert_q();
                break;
            case 2:
                delete_q();
                break;
            case 3:
                display_q();
                break;
            default:
                printf("Wrong choice\n");
        }
    }
}
int insert_q()
{
    int add;
    if(rear==MAX-1)
    {
        printf("Overflow\n");
    }
    else
    {
        if(front==-1)
        {
            front=0;
        }
        printf("Insert the element in queue\n");
        scanf("%d",&add);
        rear=rear+1;
        queue_a[rear]=add;
    }
}
int delete_q()
{
    if(front==-1||front>rear)
    {
        printf("Underflow\n");
    }
    else
    {
        printf("element delete from queue is:%d\n",queue_a[front]);
        front=front+1;
    }
}
int display_q()
{
    int i;
    if(front==-1)
    {
        printf("Queue is empty.\n");
    }
    else
    {
        printf("Queue is:\n");
        for(i=front;i<=rear;i++)
        {
            printf("%d\n",queue_a[i]);
        }
    }
}
