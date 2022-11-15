#include<stdio.h>
#include<string.h>

void lcs();
void print(int i,int j);

char str1[100],str2[100],strC[100][100];
int i,j,len1,len2,c[100][100],countLCS=0;

int main()
{
    while(true)
    {
        printf("Enter 1st String : ");
        gets(str1);
        printf("Enter 2nd String : ");
        gets(str2);
        printf("\nThe Longest Common Subsequence is : ");
        lcs();
        print(len1,len2);
        printf("\nThe Length of the Subsequence is : %d",countLCS);
        printf("\n\n\n");
    }
    return 0;
}

void lcs()
{
    len1=strlen(str1);
    len2=strlen(str2);
    for(i=0; i<=len1; i++)
    {
        c[i][0]=0;
    }
    for(j=0; j<=len2; j++)
    {
        c[0][j]=0;
    }

    for(i=1; i<=len1; i++)
    {
        for(j=1; j<=len2; j++)
        {
            if(str1[i-1]==str2[j-1])
            {
                c[i][j]=c[i-1][j-1]+1;
                strC[i][j]='c';
            }
            else if(c[i-1][j]>=c[i][j-1])
            {
                c[i][j]=c[i-1][j];
                strC[i][j]='u';
            }
            else
            {
                c[i][j]=c[i][j-1];
                strC[i][j]='l';
            }
        }
    }
}

void print(int i,int j)
{
    if(i==0 || j==0)
    {
        return;
    }
    if(strC[i][j]=='c')
    {
        print(i-1,j-1);
        printf("%c",str1[i-1]);
        countLCS++;
    }
    else if(strC[i][j]=='u')
    {
        print(i-1,j);
    }
    else
    {
        print(i,j-1);
    }
}
