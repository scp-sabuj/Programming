//Ashish Deb.
//CSE Spring'15
//swap two integer.c

#include <stdio.h>

int main()
{
    int a, b, swap;
    printf("Enter the value of a and b\n");
    scanf("%d%d", &a, &b);
    printf("Before swaping\na=%d\nb=%d\n", a, b);
    swap=a;
    a=b;
    b=swap;
    printf("After swaping\na=%d\nb=%d", a, b);

   return 0;
}
