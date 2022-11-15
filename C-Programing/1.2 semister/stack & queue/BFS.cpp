#include <stdio.h>
#include <conic.h>
int a[20][20],q[20],visited[20],n,i,j,f=0,r=-1;
void bfs(int v);
void main()
{
    int v;
    clrscr();
    printf("Enter the number of vertices:\n");
    scanf("%d",&n);
    for(i=1;i<=n;i++)
    {
        q[i]=0;
        visited[i]=0;
    }
    printf("Enter graph data in matrix from:\n");
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            scanf("%d",&a[i][j]);
        }
    }
     printf("enter the startting vertices:\n");
     scanf("%d",&v);
     bfs(v);
     printf("The node which are reachable:\n");
     for(i=1;i<=n;i++)
     {
         if(visited[i])
         {
             printf("%d\n",i);
         }
     }
     else
}
void bfs(int v)
{
    for(i=1;i<=n;i++
    {
        if(a[v][i]&&!visited[i])
            {
                q[++r]=i;
            }
    }
    if(f<=r)
    {
        visited[q[f]]=1;
        bfs(q[f++]);
    }
}
