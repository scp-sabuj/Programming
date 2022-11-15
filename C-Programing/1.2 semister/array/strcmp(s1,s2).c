#include <stdio.h>
#include <string.h>
int main()
{
    char s1[100],s2[100],com;
    printf("enter the two string\n");
    gets(s1);
    gets(s2);
    com=strcmp(s1,s2);
    printf("comparission is =%s",com);
    return 0;
}
