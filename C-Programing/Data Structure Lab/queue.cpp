#include<stdio.h>
int main()
{
    int ar[5],front=-1,a,i=0,rear=-1;
    printf("if you want to insert then press '1'\nif you want to delate then press '2'\nif you want to print then press '3'\n");
    while(scanf("%d",&a)==1)
    {
        if(a==1)
            {
                if(front==0&&rear==5-1)
                {
                    printf("over flow\n");
                }
                else if(front==-1)
                {
                    front++;
                    rear++;

                   scanf("%d",&ar[rear]);
                }
                else
                {
                    rear++;
                    scanf("%d",&ar[rear]);
                }
            }
       else if(a==2)
            {
                if(front==-1)
                {
                printf("under flow\n");
                }
                else if(front==rear)
                {
                    front=-1;
                    rear=-1;
                }
                else
                {
                    front=front+1;
                }
            }
        else if(a==3)
            {
                if(front==-1)
                    printf("empty\n");
                else
                {
                    for(i=front;i<=rear;i++)
                   {
                    printf("%d\n",ar[i]);
                   }
                }
            }
    }

    return 0;

}
