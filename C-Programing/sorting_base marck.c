#include <stdio.h>
typedef struct
{
    char n[100];
    int id;
    float m;
}student;
int main()
{
    int i,j,n;
    printf("Enter number of stdent:");
    scanf("%d",&n);
    student t,s[n];
    printf("Enter student name,id,marks:\n");
    for(i=0;i<n;i++)
    {
        scanf("%s %d %f",&s[i].n,&s[i].id,&s[i].m);
    }
    for(i=0;i<n;i++)
    {
        for(j=0;j<n-i;j++)
        {
            if(s[j].m<s[j+1].m)
            {
                t=s[j];
                s[j]=s[j+1];
                s[j+1]=t;
            }
        }
    }
    for(i=0;i<n;i++)
    {
        printf("%d.name:%s id:%d marks:%f\n",i+1,s[i].n,s[i].id,s[i].m);
    }
    return 0;
}
