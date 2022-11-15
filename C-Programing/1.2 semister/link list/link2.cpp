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
            while(start->next!=NULL){
            ///cout<<start->info;
            printf("%d ",start->info);
            start=second;
            second=second->next;}
        }

    }
}
