#include <stdio.h>
#include <string.h>
int main()
{
    char a[100],i,l;
    printf("enter the array\n");
    gets(a);
    l=strlen(a);
    for(i=0;i<l;i++)
    {
        if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]==' '||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
        {
            continue;
        }
        printf("%c",a[i]);
    }

    return 0;
}
