#include<iostream>
#include<vector>
#include<string.h>
using namespace std;
vector<int>ver,adj[100];
bool flag[200];

void dfs(int source)
{
    int stack[100];
    int top=0;
    stack[top] = source;
    flag[source] = true;
    while(top>=0)
    {
        int u = stack[top];
        bool isTaken = false;
        for(int i=0;i<adj[u].size();i++)
        {
            int v = adj[u][i];
            if(!flag[v])
            {
                flag[v] = true;
                top++;
                stack[top] = v;
                isTaken = true;
                break;
            }
        }
        if(!isTaken)
        {
            cout<<stack[top]<<" ";
            top--;
        }
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
        dfs(source);
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
1

5
1 2 2 3
2 2 1 4
3 3 1 4 5
4 2 2 3
5 1 3
1

*/
