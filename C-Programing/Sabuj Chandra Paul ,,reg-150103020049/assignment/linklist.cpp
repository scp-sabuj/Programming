#include<stdio.h>
#include<stdlib.h>
struct node
{
    int info;
    node *next;
};
int main()
{
    node *start, *second, *trav;
    int n;
    bool flag = false;
    while(scanf("%d",&n)==1)
    {
        if(n==0)
        {
            trav = start;
            while(trav != NULL)
            {
                printf("%d ",trav->info);
                trav = trav->next;
            }
            printf("\n");
            continue;
        }
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
