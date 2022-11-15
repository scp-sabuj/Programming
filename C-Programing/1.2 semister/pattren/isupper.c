
#include <stdio.h>
int main()
{
    char ch= 'B', ch2;
    if(islower(ch))
    {
        ch2=toupper(ch);
        printf("%c", ch2);
    }
    else
    {
        ch2=tolower(ch);
        printf("%c", ch2);
    }

    return 0;
}
