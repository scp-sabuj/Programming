#include<stdio.h>
int main()
{
    int n,m,c=0;
    while(scanf("%d%d",&n,&m)==2)
    {
        int i=0;
        c=0;
        int t;
        for(i=0; i<m; i++)
        {
            scanf("%d",&t);
            c=c+t;
        }
        int ans = n/c;
        if(n%c>0)
        {
            ans++;
        }
        if(ans==1)
            printf("Project will finish within %d day.\n",ans);
        else
            printf("Project will finish within %d days.\n",ans);
    }

}
