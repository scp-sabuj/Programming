#include <stdio.h>
int main()
{
    char ch, ch2;
    printf("ch=");
    scanf("%c", &ch);
    ch2=toupper(ch);
    printf("Uppercase of the letter is %c\n", ch2);




    return 0;
}

