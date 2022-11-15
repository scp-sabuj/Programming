#include<stdio.h>
#include<iostream>
#include<string.h>
using namespace std;

char graph[100][100];
bool flag[100][100];

struct st{
    int r;
    int c;
};

void bfs(int r,int c)
{
    flag[r][c] = true;
    int front = 0, rear = 0, row, col;
    st queue[100];
    st point;
    point.r = r;
    point.c = c;
    queue[rear] = point;
    while(front<=rear)
    {
        row = queue[front].r;
        col = queue[front].c;
        if(row-1>=0 && graph[row-1][col] == '*' && !flag[row-1][col])
        {
            flag[row-1][col] = true;
            point.r = row-1;
            point.c = col;
            rear++;
            queue[rear] = point;
        }
        if(graph[row+1][col] == '*' && !flag[row-1][col])
        {
            flag[row+1][col] = true;
            point.r = row+1;
            point.c = col;
            rear++;
            queue[rear] = point;
        }
        if(col-1>=0 && graph[row][col-1] == '*' && !flag[row][col-1])
        {
            flag[row][col-1] = true;
            point.r = row;
            point.c = col-1;
            rear++;
            queue[rear] = point;
        }
        if(graph[row][col+1] == '*' && !flag[row][col+1])
        {
            flag[row][col+1] = true;
            point.r = row;
            point.c = col+1;
            rear++;
            queue[rear] = point;
        }
        if(row-1>=0 && col-1>=0 && graph[row-1][col-1] == '*' && !flag[row-1][col-1])
        {
            flag[row-1][col-1] = true;
            point.r = row-1;
            point.c = col-1;
            rear++;
            queue[rear] = point;
        }
        if(row-1>=0 && graph[row-1][col+1] == '*' && !flag[row-1][col+1])
        {
            flag[row-1][col+1] = true;
            point.r = row-1;
            point.c = col+1;
            rear++;
            queue[rear] = point;
        }
        if(col-1>=0 && graph[row+1][col-1] == '*' && !flag[row+1][col-1])
        {
            flag[row+1][col-1] = true;
            point.r = row+1;
            point.c = col-1;
            rear++;
            queue[rear] = point;
        }
        if(graph[row+1][col+1] == '*' && !flag[row+1][col+1])
        {
            flag[row+1][col+1] = true;
            point.r = row+1;
            point.c = col+1;
            rear++;
            queue[rear] = point;
        }
        front++;
    }


}

int solution(int m,int n)
{
    int reason = 0;
    for(int i=0;i<m;i++)
    {
        for(int j=0;j<n;j++)
        {
            if(graph[i][j] == '*' && !flag[i][j])
            {
                reason++;
                bfs(i,j);
            }
        }
    }
    return reason;
}

int main()
{

    int m,n;
    char ch;
    while(scanf("%d%d ",&m,&n)==2)
    {
        memset(flag,false,sizeof(flag));
        memset(graph,'\0',sizeof(graph));
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                cin>>graph[i][j];
            }
            scanf("%c",&ch);
        }

        int result = solution(m,n);
        cout<<result<<endl;
    }

}

/*
6 5
*.*..
*.*..
.*..*
.....
.*.*.
*.*..
*/
