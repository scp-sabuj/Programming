#include<iostream>
#include<string.h>
using namespace std;


struct str{
    int r;
    int c;
};

bool color[100][100];
int graph[100][100];
str queue[100];

void BFS(int i, int j)
{
    int row,col,front,rear;
    color[i][j] = true;
    front = 0;
    rear = 0;
    str temp;
    temp.r = i;
    temp.c = j;
    queue[rear] = temp;
    while(front<=rear)
    {
        row = queue[front].r;
        col = queue[front].c;
        front++;
        if(row-1>=0 && graph[row-1][col] == 1 && !color[row-1][col])
        {
            color[row-1][col] = true;
            rear++;
            temp.r = row-1;
            temp.c = col;
            queue[rear] = temp;
        }
        if(col-1>=0 && graph[row][col-1] == 1 && !color[row][col-1])
        {
            color[row][col-1] = true;
            rear++;
            temp.r = row;
            temp.c = col-1;
            queue[rear] = temp;
        }
        if(graph[row+1][col] == 1 && !color[row+1][col])
        {
            color[row+1][col] = true;
            rear++;
            temp.r = row+1;
            temp.c = col;
            queue[rear] = temp;
        }
        if(graph[row][col+1] == 1 && !color[row][col+1])
        {
            color[row][col+1] = true;
            rear++;
            temp.r = row;
            temp.c = col+1;
            queue[rear] = temp;
        }
        if(row-1>=0 && col-1>=0 && graph[row-1][col-1] == 1 && !color[row-1][col-1])
        {
            color[row-1][col-1] = true;
            rear++;
            temp.r = row-1;
            temp.c = col-1;
            queue[rear] = temp;
        }
        if(row-1>=0 && graph[row-1][col+1] == 1 && !color[row-1][col+1])
        {
            color[row-1][col+1] = true;
            rear++;
            temp.r = row-1;
            temp.c = col+1;
            queue[rear] = temp;
        }
        if(col-1>=0 && graph[row+1][col-1] == 1 && !color[row+1][col-1])
        {
            color[row+1][col-1] = true;
            rear++;
            temp.r = row+1;
            temp.c = col-1;
            queue[rear] = temp;
        }
        if(graph[row+1][col+1] == 1 && !color[row+1][col+1])
        {
            color[row+1][col+1] = true;
            rear++;
            temp.r = row+1;
            temp.c = col+1;
            queue[rear] = temp;
        }

    }
}

int main()
{

    int m,n, sum;
    while(cin>>m>>n)
    {
        sum = 0;
        memset(graph,0,sizeof(graph));
        memset(color,false,sizeof(color));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                cin>>graph[i][j];
            }
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(graph[i][j] == 1 && !color[i][j])
                {
                    sum++;
                    BFS(i,j);
                }
            }
        }

        cout<<"Number of reasons : "<<sum<<endl;
    }
}

/*
3 3
1 1 0
0 0 1
1 1 1

5 5
1 0 0 0 1
0 1 0 1 0
1 0 0 1 0
0 0 1 0 0
1 0 0 1 0
*/

