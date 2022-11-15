#include <stdio.h>
int main()
{
    int sc=0,v=0,c=0,s=0,d=0,l,i;
    char arr[100],ch;
    printf("Enter the string:\n");
    gets(arr);
    l=strlen(arr);
    printf("length of string:%d\n",l);
    for(i=0;i<l;i++)
    {
        if(arr[i]=='a'||arr[i]=='e'||arr[i]=='i'||arr[i]=='o'||arr[i]=='u')
        {
            v++;
        }
        if(arr[i]>='0'&&arr[i]<='9')
        {
            d++;
        }
        else
        {
            c++;
        }
    }
    printf("Digits=%d\n",d);
    printf("Vowel=%d\n",v);
    printf("White space=%d\n",s);
    printf("Consonant=%d\n",c);
    sc++;
    printf("jhbfkngd==",sc);
    return 0;
}
