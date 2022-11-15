#include <stdio.h>
#define MAX 50
int top=-1;
void push(int stack[],int item);
void pop(int stack[]);
main()
{
    int stack[MAX],i,n,t;
    printf("Enter the stack element number:\n");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d",&t);
        push(stack,t);
    }
    printf("\n\n");
    for(i=n-1; i>=0; i--)
        {
            pop(stack);
        }
}
void push(int stack[],int item)
{
    if(top==MAX-1)
    {
        printf("Stack Overflow");
        return;
    }
    else
    {
        stack[++top]=item;
        printf("Value inserted in stack is %d\n",item);
    }
}
void pop(int stack[])
{
    int val;
    if(top==-1)
    {
        printf("Stack underflow");
        return;
    }
    else
    {
        val = stack[top];
        --top;
    }
    printf( "Value deleted from stack is %d\n\n",val);
}
