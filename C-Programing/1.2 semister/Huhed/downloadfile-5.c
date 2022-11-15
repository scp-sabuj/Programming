#include<stdio.h>
int main()
{
    char str[100],st[10];
    int i,j,a,b,t=0;
    gets(str);
    gets(st);
    a=strlen(str);
    b=strlen(st);
    //printf("%d %d",a,b);
    for(i=0;i<=a-b+1;i++)
    {
        for(j=0;j<b;j++)
        {
            if(str[i+j]!=st[j])
            break;
        }
        if(j==b){
            printf("found %d\n",i+1);
            t++;}
    }
    if(t==0)
        printf("not found\n");

    return 0;
}
