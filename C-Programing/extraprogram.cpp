#include <stdio.h>

int main()
{
    float a , b;
    int c , d;

    scanf("%f%f",&a,&b);
    printf("\n\n%f\n%f",a,b);

    c = a*100;
    d = b*100;

    printf("\n\n%d\n%d",c,d);

    a = c/100;
    b = d/100;

    printf("\n\n%f\n%f",a,b);

    return 0;
}
