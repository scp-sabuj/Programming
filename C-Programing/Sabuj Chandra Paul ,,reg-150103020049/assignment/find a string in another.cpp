#include<stdio.h>
#include<string.h>
int main()
{
    char str[100],st[10];
    bool flag;
    int i,j,l1,l2,k=0;
    while(gets(str))
    {
        flag = false;
        gets(st);
        l1=strlen(str);
        l2=strlen(st);
        for(i=0;i<l1-l2+1;i++)
        {
            for(j=0;j<l2;j++)
            {
                if(str[i+j]!=st[j])
                {
                   break;
                }
            }
            if(j==l2){

                flag = true;
                printf("found position %d\n",i+1);
                break;
            }

        }
        if(flag==false)
            printf("not found\n");
    }


    return 0;
}
