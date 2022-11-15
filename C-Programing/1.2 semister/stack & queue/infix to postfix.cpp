#include <stdio.h>
#include <string.h>
#include <conio.h>

void push(char);
char pop();
int prece(char);
char stack[50];
int top=-1;
char ch;

int main()
{
    char e[25],p[25];

    int i=0,j=0,l;


    printf("enter infix expression \n");

    scanf("%s",e);

    l=strlen(e);
    e[l]=')';
    e[l+1]='\0';
    push('(');
    while (top!=-1)
    {
        if((e[i]>=65 && e[i]<=90) || (e[i]>=97 && e[i]<=122))
            p[j++]=e[i++];
        else if(e[i]=='(')
        {
            push('(');
            i++;
        }
        else if(e[i]==')')
        {
            while(stack[top]!='(')
            {
                p[j++]=pop();
            }
            i++;
            ch=pop();
        }
        else if(e[i]=='^'||e[i]=='*'||e[i]=='/'||e[i]=='+'||e[i]=='-')
        {
            while(prece(stack[top])>=prece(e[i]))
                p[j++]=pop();
            push(e[i++]);
        }
    }
    printf("the corresponding postfix expression is: \n");
    p[j]='\0';

    printf("%s",p);

    getch();
}
void push(char ch)
{
    if(top==49)
        printf("full stack");
    else
    {
        stack[++top]=ch;
    }
}


char pop()
{
    char ch;
    if(top==-1)
    {
        printf("stack is empty");
        return '#';
    }
    else
    {
        ch=stack[top];
        top--;
        return ch;
    }
}


int prece(char ch)
{
    switch(ch)
    {
    case '^':
        return 3;
    case '*':
    case '/':
        return 2;
    case '+':
    case '-':
        return 1;
    case '(':
        return 0;
    }
}
