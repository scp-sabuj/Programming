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
    double read;
    double read1;
    scanf("%lf%lf",&a ,&b);
    while(true)
    {
        read=ansequation(a);
        if(read==0||read>0)
        {
            printf("lower limit is Invalid\n");
            a--;
            read=ansequation(a);
            break;
        }
        else
        {
            a++;
            continue;
        }
    }
    while(true)
    {
        read1=ansequation(b);
        if(read1==0||read1<0)
        {
            printf("lower limit is Invalid\n");
            b++;
            read1=ansequation(b);
            break;
        }
        else
        {
            b--;
            continue;
        }
    }
    printf("%lf--%lf",a,b);
    printf("\n\n\n");
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
            printf("%llf-->%llf-->%llf-->%llf\n",a,b,m,read);
        }

    }
    return 0;
}
