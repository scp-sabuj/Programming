#include<stdio.h>
int main()
{
    char i='0';
    char a[]={'a','b','c'};
    for(i;i<='9';i++)
        printf("%c %d\n",i,i);
    printf("%c\n",a[0]);

    return 0;
}
