#include<stdio.h>
// Returns the count of ways we can sum S[0...m-1] coins to get sum n
int count( int S[], int n, int val )
{
    // If n is 0 then there is 1 solution (do not include any coin)
    if (val == 0)
    {
        return 1;
    }
    // If n is less than 0 then no solution exists
    if (val < 0)
    {
        return 0;
    }
    // If there are no coins and n is greater than 0, then no solution exist
    if (n <=0 && val >= 1)
    {
        return 0;
    }
    // count is sum of solutions (i) including S[m-1] (ii) excluding S[m-1]
    else
    {
        return count( S, n - 1, val ) + count(S, n, val-S[n-1] );
    }
}
// Driver program to test above function
int main()
{
    int i, j;
    int arr[100],n,val;// = {1, 2, 3};
    printf("Enter the size of array : ");
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
        scanf("%d",&arr[i]);
    }
    printf("Enter the value to make : ");
    scanf("%d",&val);
    printf("%d ", count(arr, n, val));
    return 0;
}
