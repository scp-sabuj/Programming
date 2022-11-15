#include<stdio.h>
#include<string.h>
int main()
{
    char str[100], str1[100];
    int i, j=0, len;
    printf("Enter a line of character:\n");
    gets(str);
    len=strlen(str);
    for(i=0; i<len; i++)
    {
        //j=0;
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u', str[i]==' ')
        {
            j=1;
            break;
        }
        else
        //if(j==0)
        printf("%c", str[i]);

    }



    return 0;
}
