#include<stdio.h>

int main()
{
    int n, arr[100];
    bool flag = false;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&a[i]);
        flag = false;
        for(int j=0;j<i;j++)
        {
            if(a[i] == a[j])
            {
                flag = true;
                break;
            }
        }
    }
}
