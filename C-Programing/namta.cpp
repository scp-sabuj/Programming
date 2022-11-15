#include <stdio.h>

int main()
{
    int start, ends;

    printf("Enter the limitation : ");
    scanf("%d%d",&start,&ends);

    for(int i = start ; i<=ends ; i++)
    {
        printf("The 'Namta' of '%d' is bellow : \n\n");
        for(int j = 1; j < 11 ; j++)
        {
            int temp = i*j;
            if(j!=10)
            {
                printf("%d * %d  = %d\n" , i , j , temp);
            }
            else
            {
                printf("%d * %d = %d\n" , i , j , temp);
            }
        }
        printf("\n\n\n\n");
    }

    return 0;
}
