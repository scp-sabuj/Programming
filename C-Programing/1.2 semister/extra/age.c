#include <stdio.h>
int main()
{
    long int i=0, age, y, m, d, y1, m1, d1, t, y2, d2, m2, m3;
    scanf("%ld %ld %ld", &y,&m,&d);
    scanf("%ld", &t);

    for(i=0; i<t; i++)
    {
            scanf("%ld%ld%ld", &y1, &m1, &d1);
            if(m1<=5||y%4==0||y%400==0||y1%4==0||y1%400==0)
            {
                m2=31;
            }
            /*else if(y1%4==0||y1%400==0)
            {
                m2=31;
            }*/
            else
            {
                m2=30;
            }
            if(d<d1)
            {
                d=d+m2;
                d2=d-d1;
                m-=1;
            }
            else
            {
                d2=d-d1;
            }
            if(m<m1)
            {
                m+=12;
                m3=m-m1;
                y-=1;
            }
            else
            {
                m3=m-m1;
            }

            y2=y-y1;

            if(m3<=5||y%4==0||y%400==0||y1%4==0||y1%400==0)
            {
                m2=31;
            }
            else
            {
                m2=30;
            }

            age=(y2*365)+(m3*m2)+d2;
            printf("%ld\n", age);


    }
    return 0;
}
