#include<iostream>
#include<stdlib.h>
#include<stdio.h>
typedef struct node
{
    int info;
    node *next;
};
int main()
{
    int d;
    node *start,*second;
    start=(node*)malloc(sizeof(node));
    second=(node*)malloc(sizeof(node));
    start->next=second;
    second->info;
    second->next=NULL;
    for(;;)
    {
        scanf("%d",&start->info);
        ///cin>>start->info;

        if(start->info!=0)
        {
            second=start;
            start=(node*)malloc(sizeof(node));
            start->next=second;

        }
        else
        {
            printf("\nEnter delete number:");
            scanf("%d",&d);
            while(second->next!=NULL)
            {
                ///cout<<start->info;
                if(second->info != d)
                {
                    printf("%d ",second->info);
                }
                second=second->next;
            }

            /*while(second->next!=NULL)
            {
                ///cout<<start->info;
                if(second->info==d)
                {
                    start=second;
                    second=second->next;
                }
                else
                {
                    printf("%d ",second->info);
                start=second;
                second=second->next;}
            }*/
        }

    }
}

