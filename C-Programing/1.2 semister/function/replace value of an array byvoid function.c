#include <stdio.h>
void test_function(int arr[]);
int main()
{
    int arr[]={1,5,6,7,9,2,8,2,5,6};
    printf("%d\n",arr[0]);
    test_function(arr);
    printf("%d\n",arr[0]);
    return 0;
}
void test_function(int arr[])
{
    arr[0]=100;
    return;
}
