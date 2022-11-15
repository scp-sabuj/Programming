//Ashish Deb.
//CSE Spring'15
//area of a circle.c

#include <stdio.h>
#include <math.h>
#define PI 3.1416
int main()
{
    float r, area;
    printf("Enter the radious of the circle\n");
    scanf("%f", &r);
    //pi=3.1416;
    area= PI*pow(r,2);
    printf("area=%.2f", area);

    return 0;
}
