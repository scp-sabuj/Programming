#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main()
{
    char str1[100],str2[100];
    int k=0,l,len1,len2,index=0;
    gets(str1);
    gets(str2);
    len1=strlen(str1);
    len2=strlen(str2);
    bool flag=false;
    for(l=0;l<len2;l++)
    {
        if(str2[l]!=str1[k+l-1])
        {
            k++;
        }
        else
        {
            flag=true;
            break;
        }
    }
    if(flag=true)
    {
        printf("found");
    }
    else
    {
        printf(" not found");
    }
    return 0;
}

