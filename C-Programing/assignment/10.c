#include<stdio.h>
int main()
{
    char a;
    FILE *in=fopen("in.txt","r");
    FILE *out=fopen("out.txt","w");
    if(in==NULL)
        printf("ERROR:File Not Found");
    else
    {
        while(!feof(in))
        {
            fscanf(in,"%c",&a);
            fprintf(out,"%c",a);
        }
    }
    fclose(out);
    fclose(in);
}
