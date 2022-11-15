#include<iostream>
#include<stdio.h>
#include<string.h>
using namespace std;

int main()
{
    int n;
    int matrix[130][130];
    char a,b;
    int cost;
    while(cin>>n)
    {
        memset(matrix,-1,sizeof(matrix));
        for(int i=0;i<n;i++)
        {
            scanf(" %c %c %d",&a,&b,&cost);
            matrix[a][b] = cost;
            //matrix[b][a] = cost;//(IF we want same cost opossite too)
        }
        scanf(" %c %c",&a,&b);
        cout<<matrix[a][b]<<endl;
    }

}

/*
6
a b 2
a c 0
a d 3
b c 5
b e 1
c e 2
a d
*/
