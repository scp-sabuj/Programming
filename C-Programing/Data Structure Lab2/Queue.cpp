#include<iostream>
using namespace std;

#define limit 5

int main()
{
    int n, m, queue[100], front=-1, rear=-1;

    while(cin>>n)
    {

        if(n == 1)
        {
            if((front == 0 && rear == limit-1) || (rear == front-1))
            {
                cout<<"overflow"<<endl;
                continue;
            }
            cin>>m;

            if(front == -1)
            {
                front = 0;
                rear = 0;
            }
            else if(rear == limit-1)
            {
                rear = 0;
            }
            else
            {
                rear++;
            }
            queue[rear] = m;
        }
        else if(n == 2)
        {
            if(front == -1)
            {
                cout<<"underflow"<<endl;
            }
            else if(front == rear)
            {
                front = -1;
                rear = -1;
            }
            else if(front == limit-1)
            {
                front = 0;
            }
            else front++;
        }
        else
        {
            if(front>rear)
            {
                for(int i = front; i < limit ; i++)
                {
                    cout<<queue[i]<<" ";
                }
                for(int i = 0; i <= rear ; i++)
                {
                    cout<<queue[i]<<" ";
                }
                cout<<endl;
                continue;
            }
            for(int i=front; i<=rear ; i++)
            {
                cout<<queue[i]<<" ";
            }
            cout<<endl;
        }
    }
}
