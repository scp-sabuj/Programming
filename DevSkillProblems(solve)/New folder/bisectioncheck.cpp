#include<stdio.h>
#include<math.h>
double a,b,m;

double ansequation(double y)
{
    double ans=pow(y,3)-2*pow(y,2)-4;
    return ans;
}

int main()
{
    scanf("%lf%lf",&a ,&b);
    double read=ansequation(a);
    double read1=ansequation(b);
    if((read<0)&&(read1>0))
    {
        for(int i=0; i<20; i++)
        {
            m=(a+b)/2;
            read=ansequation(m);
            if(read<0)
            {
                a=m;
            }
            else if(read>0)
            {
                b=m;
            }
            else
            {
                printf("Root is %llf\n",m);
                break;
            }
            printf("%llf %llf %llf %llf\n",a,b,m,read);
        }
        int n=floor(a);
        int l=ceil(b);
        printf("%d %d",n,l);

    }
    else
        printf("Not Found\n");
}
