#include<stdio.h>
#include<string.h>
int main()
{
    char a[100];
    int i, j, k[26]={0};
    printf("Enter a line of character:\n");
    gets(a);
    while(a[i]!='\0')
    {
        if(a[i]>='a'&&a[i]<='z')
            k[a[i]-'a']++;
            i++;
    }
    for(i=0; i<26; i++)
    {
        if(k[i]!=0)
        printf("%c = %d\n", i+'a', k[i]);
    }
    /*for(i=1; i<n; i++)
    {
        for(j=0; j<n-i; k++)
        {
            if(a[k]>a[k+1]){
               temp=a[k];
               a[k]=a[k+1];
               a[k+1]=temp;
            }
        }
    }

    for(k=0; k<n; k++)
    {
        printf("%d ", a[k]);
    }*/


    return 0;
}
