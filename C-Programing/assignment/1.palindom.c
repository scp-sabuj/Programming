#include<stdio.h>
#include<string.h>
int main()
{
    int i,l;
    char arr[100];
    printf("Enter your number:\n");
    gets(arr);
    l=strlen(arr);
    for(i=0,l--;i<=l;i++,l--)
    {
        if(arr[i]!=arr[l])
        {
        printf("%s is not palindrome",arr);
            break;
        }
    }
    if(i>=l)
        printf("%s is palindrome",arr);
    return 0;
}
