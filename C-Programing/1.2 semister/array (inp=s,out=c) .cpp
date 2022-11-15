#include <stdio.h>
#include <string.h>
int main()
{
    char a[100],n,i,l;
    printf("enter the array\n");
    gets(a);
    l=strlen(a);
    for(i=0;i<l;i++)
    {
        if(a[i]==' ')
        {
            a[i]=a[i];
        }
        else
        {
            a[i]=a[i]-32;
        }
    }
    puts(a);
    return 0;
}
