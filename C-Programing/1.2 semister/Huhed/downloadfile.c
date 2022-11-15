#include <stdio.h>
float area(float r)
{
    float n;
    n=(3.1416*r*r);
    return(n);
}
int main()
{
    float r,n;
    printf("Enter Radius value=");
    scanf("%f",&r);
    n=area(r);
    printf("Area is=%f",n);
    return 0;
}
