#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
    char str1[100],str2[100];
    int i,j,len1,len2,temp;
    gets(str1);
    gets(str2);
    len1=strlen(str1);
    len2=strlen(str2);
    bool flag=false;
    for(i=0;i<len1;i++)
    {
        for(j=0;j<len2;j++)
        {
            if(str2[j]==str2[i])
            {
                temp=i;
                break;
            }
            else
            {
                continue;
            }
        }
    }
    if(flag==true)
    {
        printf("found");
    }
    else
    {
        printf("not found");
    }
}
