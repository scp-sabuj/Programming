#include <iostream>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
using namespace std;
struct node
{
    int info;
    node *next;
};
int main()
{
    node *start,*second;
    //start=(node*)malloc(sizeof(node));
    //second=(node*)malloc(sizeof(node));
    start->info=2;
    second->info=3;
    second->next=NULL;
    start->next=second;
    while(start!=NULL)
    {
        cout<<start->info<<endl;
        //printf("%d\n",start->info);
        start=start->next;
    }
    return 0;
}
