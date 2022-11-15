#include <stdio.h>
#include <string.h>

int main()
{
    int l,i=0,lc=0;
    char arr[1000],ch;
    printf("Enter the String:\n");
    gets(arr);
    l=strlen(arr);
    for(i=0;i<l;i++)
    {
        if((arr[i]>=65&&arr[i]<=90)||(arr[i]>=97&&arr[i]<=123))
        {
            lc=lc+1;
        }
        else
        {
            continue;
        }
    }
    printf("Total letter is : %d",lc);

    return 0;

}
