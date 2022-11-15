#include <stdio.h>
#include <string.h>
int main()
{
    char str[100];

    while(true)
    {
        int i,temp=0;
        printf("Enter the String:\n");
        gets(str);
        for(i=0; i<strlen(str); i++)
        {
            if(str[i]!=' ')
            {
                temp=temp+str[i];
            }
        }
        printf("The ASCII value of String is:%d\n",temp);
        printf("\n\n\n");
    }
    return 0;
}
