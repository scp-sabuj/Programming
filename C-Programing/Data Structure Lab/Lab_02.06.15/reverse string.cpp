#include<stdio.h>
#include<string.h>
int main()
{
    char a[100], b[100];
    int i, j, len;

    while(1)
    {
        printf("Enter a line of character:\n");
        gets(a);
        len=strlen(a);
        for(i=len-1, j=0; i>=0; i--, j++)
            b[j]=a[i];
        b[j]='\0';
        printf("%s\n", a);
        //puts(b);
    }



    return 0;
}
