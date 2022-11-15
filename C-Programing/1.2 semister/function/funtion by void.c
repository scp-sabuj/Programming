#include <stdio.h>
void fun(int a[])
{
    a[0]=100;
    printf("a=%d\n",a[0]);
    return;
}
int main()
{
    int x[]={1,0,5,65,4,1};
    int z;
    fun(x);
    printf("%d\n",x[0]);
    return 0;
}
