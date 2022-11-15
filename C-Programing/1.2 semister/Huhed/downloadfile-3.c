#include<stdio.h>
int main()
{
    FILE *input,*output;
    input=fopen("input.txt","r");
    output=fopen("output.txt","w");
    if(input==NULL)
        printf("Error");
    else
    {
        char ch[100];
        fgets(ch, 100, input);
        fputs(ch, output);
        fclose(input);
        fclose(output);
    }
    return 0;
}
