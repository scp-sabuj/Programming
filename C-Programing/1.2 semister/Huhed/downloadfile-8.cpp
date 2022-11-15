#include<stdio.h>
#include<stdlib.h>

struct node{
    int info;
    node *next;
};

void traverse(node *start)
{
    printf("Values in the Linked List:\n");
    while(start != NULL)
    {
        printf("%d ",start->info);
        start = start->next;
    }
    printf("\n");
}

void del(int m, node *start)
{
    node *save, *loc;
    save = start;
    loc = start->next;
    while(loc != NULL)
    {
        if(loc->info == m)
        {
            break;
        }
        else
        {
            save = loc;
            loc = loc->next;
        }
    }
    if(loc == NULL){
        printf("Value not found\n");
        return;
    }
    save->next = loc->next;

}

int main()
{
    node *start, *second;
    int n,m;
    bool flag = false;

    while(scanf("%d",&n)==1)
    {
        if(n < 0)
        {
            scanf("%d",&m);
            if(m == start->info)
            {
                start = start->next;
                traverse(start);
            }
            else
            {
                del(m, start);
                traverse(start);
            }
        }
        else if(n==0)
        {
            traverse(start);
        }
        else
        {
            if(flag == false)
            {
                start = (node*)malloc(sizeof(node));
                start->info = n;
                start->next = NULL;
                flag = true;
            }
            else
            {
                second = (node*)malloc(sizeof(node));
                second->info = n;
                second->next = start;
                start = second;
            }
        }


    }
}
