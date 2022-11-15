#include <stdio.h>
int main()
{
    int var=20;
    int *ip;
    ip=&var;
    printf("Address of var variable=%x\n",&var);
    printf("Address storeed in ip=%x\n",ip);
    printf("value of *ip=%d\n",*ip);
    return 0;
}
