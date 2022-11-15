#include <stdio.h>
typedef struct
{
    int reg;
    char name[100];
    int pro,mat,eng;
}student;
int main()
{
    int n,i;
    printf("enter student number:\n");
    scanf("%d",&n);
    student pro,mat,eng,s[n];
    printf("Enter student id,name,programing,math,english subject marks one by one\n");
    for(i=0;i<n;i++)
    {
        scanf("%d%s%d%d%d",&s[i].reg,&s[i].name,&s[i].pro,&s[i].mat,&s[i].eng);
    }
    pro=mat=eng=s[0];
    for(i=1;i<n;i++)
    {
        s[i].pro>pro.pro;
        pro=s[i];
        s[i].mat>mat.mat;
        mat=s[i];
        s[i].eng>eng.eng;
        eng=s[i];
    }
    printf("Programming maximum marks:\nname:%s\nmarks:%d\n",pro.name,pro.pro);
    printf("Math maximum marks:\nname:%s\nmarks:%d\n",mat.name,mat.mat);
    printf("English maximum marks:\nname:%s\nmarks:%d\n",eng.name,eng.pro);
    return 0;
}
