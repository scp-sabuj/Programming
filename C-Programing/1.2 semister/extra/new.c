#include <stdio.h>
int main()
{
    double a,b,p,r,n;
    //printf("Enter the value of p, r and n\n");
    //scanf("%d%d%d%d", &p, &r, &n);
    p=200000;
    r=0.11;
    n=3;
    b=pow((1+r), n);
    a=p*b;
    printf("The Total Amount is %.2lf", a);



    return 0;
}
