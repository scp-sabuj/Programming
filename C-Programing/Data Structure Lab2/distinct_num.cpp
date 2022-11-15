#include<stdio.h>

int main()
{
    int n, arr[100];
    bool flag = false;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
        flag = false;
        for(int j=0;j<i;j++)
        {
            if(arr[i] == arr[j])
            {
                flag = true;
                break;
            }
        }
    }
}
