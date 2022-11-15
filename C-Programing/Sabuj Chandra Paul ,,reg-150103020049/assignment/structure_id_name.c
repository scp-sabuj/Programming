#include<stdio.h>
typedef struct
{
    int id;
    char name[10];
    double mat,phy,eng;
} student;
int main()
{
    student a[30],m,p,e;
    int i,n;
    printf("Enter the number of students:\n");
    scanf("%d",&n);
    for(i=0; i<n; i++)
    {
        scanf("%d%s%d%d%d",&a[i].id,&a[i].name,&a[i].mat,&a[i].phy,&a[i].eng);
    }
    for(i=0; i<n; i++)
    {
        printf("\nId no=%d\nName=%s\nMath=%d\nPhysics=%d\nEnglish=%d\n\n\n",a[i].id,a[i].name,a[i].mat,a[i].phy,a[i].eng);
    }
    m=p=e=a[0];
    for(i=1; i<n; i++)
    {
        if(a[i].mat>m.mat)
            m=a[i];
        if(a[i].phy>p.phy)
            p=a[i];
        if(a[i].eng>e.eng)
            e=a[i];
    }
    printf("Highest mark in Math=%d\n  name=%s Id no=%d\n",m.name,m.id);
    printf("Highest mark in Physics=%d\n  name=%s Id no=%d\n",p.name,p.id);
    printf("Highest mark in English=%d\n  name=%s Id no=%d\n",e.name,e.id);

    return 0;
}
