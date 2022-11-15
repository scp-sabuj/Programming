#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    int i, len;
    while(1)
    //for(;;)
    {
        printf("Enter a line of character:\n");
        while(gets(str))
        {
            len=strlen(str);
            if(len == 0 ) continue;
            for(i=0; i<len; i++)
            {
                if(str[i]>=97&&str[i]<=122)
                    str[i]=str[i]-32;
            }
            printf("%s\n", str);
        }

    }


    return 0;
}
