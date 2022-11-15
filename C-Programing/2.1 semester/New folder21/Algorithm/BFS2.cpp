#include<iostream>
#include<vector>
#include<string.h>
using namespace std;

vector<int>ver,adj[100];
bool flag[200];

void bfs(int source)
{
    int front=0, rear=0, u, v;
    int queue[100];
    flag[source] = true;
    queue[front] = source;
    while(front<=rear)
    {
        u = queue[front];
        cout<<u<<" ";
        for(int i=0;i<adj[u].size();i++)
        {
            v = adj[u][i];
            if(!flag[v])
            {
                flag[v] = true;
                rear++;
                queue[rear] = v;
            }
        }
        front++;
    }
    cout<<endl;
}
int main()
{
    int m, n, u, v, source;
    while(true)
    {
        cout<<"Enter the number of vertex : ";
        cin>>m;
        memset(flag,false,sizeof(flag));
        ver.clear();
        for(int i=0;i<m;i++)
        {
            cin>>u;
            cin>>n;
            ver.push_back(u);
            adj[u].clear();
            for(int j=0;j<n;j++)
            {
                cin>>v;
                adj[u].push_back(v);
            }
        }
        cout<<"Enter the Source : ";
        cin>>source;
        bfs(source);
    }
}

/*
6
1 3 2 3 4
2 2 1 5
3 2 1 4
4 4 1 3 5 6
5 3 2 4 6
6 2 4 5
6


*/
