#include<stdio.h>
typedef struct
{
    int id;
    char name[100];
    int b,p,m;
}student;
int main()
{
    int n,i;
    printf("how many student:");
    scanf("%d",&n);
    student b,p,m,s[n];
    printf("Enter student id,name,bangla,programing,math subject marks one by one\n");
    for(i=0;i<n;i++)
    {
        scanf("%d %s %d %d %d",&s[i].id,&s[i].name,&s[i].b,&s[i].p,&s[i].m);
    }
    b=m=p=s[0];
    for(i=1;i<n;i++)
    {
        if(s[i].b>b.b)
            b=s[i];
        if(s[i].p>p.p)
            p=s[i];
        if(s[i].m>m.m)
            m=s[i];
    }
    printf("bangla hight mark is:\nname:%s\nreg-no:%d\nmarks:%d",b.name,b.id,b.b);
    printf("programing hight mark is:\nname:%s\nreg-no:%d\nmarks:%d\n",p.name,p.id,p.p);
    printf("math hight mark is:\nname:%s\nreg-no:%d\nmarks:%d",m.name,m.id,m.m);
    return 0;
}
