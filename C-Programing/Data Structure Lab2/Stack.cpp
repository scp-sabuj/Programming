#include<iostream>
using namespace std;

#define limit 5

int main()
{
    int n, m, stack[100], top = -1;

    while(cin>>n)
    {

        if(n == 1)
        {
            if(top == limit-1)
            {
                cout<<"Stack Overflow"<<endl;
                continue;
            }
            cin>>m;
            top++;
            stack[top] = m;
        }
        else if(n == 2)
        {
            if(top == -1)
            {
                cout<<"Stack Underflow"<<endl;
                continue;
            }
            top--;
        }
        else
        {
            for(int i = top; i >= 0 ; i--)
            {
                cout<<stack[i]<<" ";
            }
            cout<<endl;
        }
    }
}
