#include<stdio.h>
#include<iostream>
#include<vector>
#include<string.h>

using namespace std;

typedef struct
{
    char f,s;
} st;

st g[150];
vector<char> ver;
vector<char> adj[150];

int main()
{
    int v,e,col;
    cout<<"Enter the number of vertex and edge : ";
    cin>>v>>e;

    for(int i=0; i<e; i++)
    {
        cin>>g[i].f>>g[i].s;
    }
    cout<<endl;
    char source;
    ver.clear();
    for(int j=0; j<v; j++)
    {
        source=g[j].f;
        ver.push_back(source);
        adj[source].clear();
        for(int i=0; i<e; i++)
        {
            if(source==g[i].s)
            {
                adj[source]=g[i].s;
            }
        }
        cout<<"The size of : "<<source<<" is : "<<adj[source].size()<<endl;
    }
}
/*char source=g[1].f,temp=source;
    ver.clear();
    ver.push_back(source);
    col++;

    for(int i=0;i<e;i++)
    {
        if(source==g[i].s&&g[i].s!=temp)
        {
            temp=g[i].s;
            col++;
        }
    }
*/
