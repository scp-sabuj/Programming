#include <stdio.h>
int main()
{
    int y, l=1;
    scanf("%d", &y);
    while(l<=20)
    {
        if(y%4==0)
        {
            printf("%d\n", y);
            //y++;
        }
        y++;
        l++;
    }



    return 0;
}
