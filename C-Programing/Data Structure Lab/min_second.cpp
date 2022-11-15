#include<stdio.h>

int main()
{

    int n, arr[100];
    while(1)
    {
        scanf("%d",&n);
        for(int i=0; i<n; i++)
        {
            scanf("%d",&arr[i]);
        }
        int mn = arr[0], mn2 = arr[1], temp;
        if(mn2 < mn)
        {
            temp = mn;
            mn = mn2;
            mn2 = temp;
        }

        for(int i=2; i<n; i++)
        {

            if(arr[i]<mn)
            {
                temp = mn;
                mn = arr[i];
                mn2 = temp;
            }
            else if(arr[i]<mn2)
            {

                mn2 = arr[i];
            }
        }

        printf("%d\n",mn2);
    }


}
