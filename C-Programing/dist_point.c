#include<stdio.h>
#include <math.h>
typedef struct
{
   float x,y;
}point;
float dist(point p,point q)
{
    float r;
    r=sqrt(pow(p.x-q.x,2)+pow(p.y-q.y,2));
    return r;
}
int main()
{
    point p,q;
    float dix;
    printf("Enter two point:\n");
    scanf("%f%f%f%f",&p.x,&p.y,&q.x,&q.y);
    dix=dist(p,q);
    printf("dixtain is=%f",dix);
    return 0;
}
