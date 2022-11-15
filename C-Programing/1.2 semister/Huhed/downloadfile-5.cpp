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
    int n,d;
    node *start,*second,*t;
    start=(node*)malloc(sizeof(node));
    t=(node*)malloc(sizeof(node));
    second=(node*)malloc(sizeof(node));
    second=NULL;
    start->next=second;

    while(true)
    {
        scanf("%d",&n);
        ///cin>>start->info;


        if(n>0)
        {
            t=start;
            start->info=n;
            second=start;
            start=(node*)malloc(sizeof(node));
            start->next=second;

        }
        else if(n<0)
        {
            printf("Enter your delete item:");
            scanf("%d",&d);
            while(second!=NULL)
            {
                if(second->info==d)
                {
                    start=second->next;
                    break;
                }
                else
                {
                    start=second->next;
                }
            }
        }
        else if(n==0)
        {
            while(t!=NULL)
            {
                ///cout<<start->info;
                printf("%d ",t->info);
                t=t->next;

            }
        }

    }
}
