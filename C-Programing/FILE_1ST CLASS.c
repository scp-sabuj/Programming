#include <stdio.h>
int main()
{
    FILE *fp=fopen("d:\rrr.txt","r");
    if(fp=NULL)
        printf("Error:file not found\n");
    else
    {
        while(!feof(fp))
        {
            int a;
            fscanf(fp"%d",&a);
            fprintf("%d",a);
        }
    }
    fclose(fp);
    return 0;
}
