#include<stdio.h>
#include<string.h>
int main()
{
    char a[100], b[100];
    int i, e, len, temp;
    printf("Enter a line of character:\n");
    gets(a);
    len=strlen(a);
    for(e=len-1,i=0; i<len/2; e--, i++)
    {
        temp=a[i];
        a[i]=a[e];
        a[e]=temp;
        //end--;
    }
    b[e]='\0';
    printf("%s", b);



    return 0;
}
