#include<stdio.h>
#include<math.h>
double a,b,m;

double ansequation(double y){
    //double y=x;
    double ans=pow(y,3)-2*pow(y,2)-4;
    return ans;
}

int main()
{
    //scanf("%llf%llf",&a,&b);
    a=2;
    b=3;
    if((a<=2)&&(b>=3))
    {
        for(int i=0;i<20;i++)
        {
            m=(a+b)/2;
            double read=ansequation(m);
            if(read<0)
            {
                a=m;
            }
            else if(read>0)
            {
                b=m;
            }
            else{
                printf("Root is %llf\n",m);
                break;
            }
            printf("%llf %llf %llf %llf\n",a,b,m,read);
        }

    }
}
