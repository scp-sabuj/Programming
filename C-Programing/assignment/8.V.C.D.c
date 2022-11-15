#include<stdio.h>
#include<string.h>
int main()
{
    int v=0,c=0,d=0,s=0,i,l,n;
    printf("Enter string letter:\n");
    scanf("%d",&n);

    printf("Enter string:\n");


    char arr[n];

    ///gets(arr);
    scanf("%s",&arr);

    l=strlen(arr);
    for(i=0;i<l;i++)
    {
        if(('0'<=arr[i])&&(arr[i]<='9'))
            d++;
        else if((arr[i]=='a')||(arr[i]=='e')||(arr[i]=='i')||(arr[i]=='o')||(arr[i]=='u'))
            v++;
        else if(arr[i]==' ')
            s++;
        else
            c++;

    }
    printf("Digits is=%d\n",d);
    printf("vowels is=%d\n",v);
    printf("consonants is=%d\n",c);
    printf("spaces is=%d",s);
    return 0;
}
