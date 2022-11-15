#include <stdio.h>
void sp(float *a,float *b)
{
    float t;
    t=*a;
    *a=*b;
    *b=t;
    return;
}
int main()
{
    float a,b;
    printf("Enter two value:\n");
    scanf("%f%f",&a,&b);
    sp(&a,&b);
    printf("swap is:%f %f",a,b);
    return 0;
}
