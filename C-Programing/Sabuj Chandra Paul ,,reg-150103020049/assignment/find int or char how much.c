#include <stdio.h>
#include <string.h>
int main()
{
    int i,l,k=0,j=0,n[100];
    char a[100],s[1000];
    gets(s);
    l=strlen(s);
    for(i=0; i<l; i++)
    {
        for(k=0; k<j; k++)
        {

            if(a[k]==s[i])
            {
                n[k]++;
                break;
            }
        }
        if(k==j)
        {
            a[j]=s[i];
            n[j]=1;
            j++;
        }
    }
    for(i=0; i<j; i++)
        printf("%c %d\n",a[i],n[i]);

    return 0;
}
