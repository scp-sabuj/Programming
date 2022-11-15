#include<stdio.h>
void dis_prime(int n1,int n2)
{
    int i,j,num;
    for(i=n1+1;i<n2;++i)
    {
        num=0;
        for(j=2;j<=i/2;++j)
        {
            if(i%j==0)
            {
                num=1;
                break;
            }
        }
        if(num==0)
            printf("%d ",i);
    }
    return;
}
int main()
{
    int n1,n2;
    printf("enter two intervals\n");
    scanf("%d %d",&n1,&n2);
    dis_prime(n1,n2);
    return 0;
}
