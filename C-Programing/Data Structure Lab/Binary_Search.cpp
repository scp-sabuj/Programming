#include<stdio.h>

int main()
{

    int n, arr[100], search_val, start_index, end_index, mid;
    bool flag = false;
    while(scanf("%d",&n)==1)
    {
        if(n<=0) break;
        flag = false;
        for(int i=0;i<n;i++) scanf("%d",&arr[i]);

        scanf("%d",&search_val);

        start_index = 0;
        end_index = n-1;

        while(start_index <= end_index)
        {
            mid = (start_index + end_index)/2;

            if( arr[mid] == search_val )
            {
                flag = true;
                printf("Its found in %d\n",mid+1);
                break;
            }
            else if(search_val < arr[mid])
            {
                end_index = mid - 1;
            }
            else
            {
                start_index = mid + 1;

            }
        }

        if(flag == false) printf("Its not found\n");
    }


}
