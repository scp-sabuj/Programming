#include <stdio.h>
int main()
{
    int n=15;
    int i=1;
    while(i<=10) {
        printf("%dX%d=%d\n", n, i, n*i);
        i=i++;
    }

    return 0;
}
