#include <stdio.h>
int main()
{
    char ch;
    switch(ch=getchar())
    {

        case 'b':
        case 'B':
            printf("BLUE");
            break;
        case 'r':
        case 'R':
            printf("RED");
        break;
        case 'g':
        case 'G':
            printf("green");
            break;
        default:
            printf("error");
    }
    return 0;
}
