#include<string.h>
#include<stdio.h>

struct st{
    int info;
    char ch;
};

int main()
{

    char str[100];
    int cnt[150], k;
    st var, arr[100], temp;
    char ch[100];
    printf("enter the string:\n");
    while(gets(str))
    {
        k = 0;
        memset(cnt,0,sizeof(cnt));
        for(int i=0;i<strlen(str);i++)
        {
            if(cnt[str[i]] == 0)
            {
                ch[k++] = str[i];
            }
            cnt[str[i]]++;

        }
        for(int i=0;i<k;i++)
        {
            var.ch = ch[i];
            var.info = cnt[ch[i]];
            arr[i] = var;
        }
        //cout<<"Before sort"<<endl;
        printf("Before sort\n");

        for(int i=0;i<k;i++)
        {
            printf("%c-%d\n",arr[i].ch,arr[i].info);
            //cout<<arr[i].ch<<"-"<<arr[i].info<<endl;
        }

        for(int i=0;i<k;i++)
        {
            for(int j=i+1;j<k;j++)
            {
                if((arr[i].info < arr[j].info) || (arr[i].info == arr[j].info && arr[j].ch < arr[i].ch))
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        printf("After sort\n");

        for(int i=0;i<k;i++)
        {
            printf("%c-%d\n",arr[i].ch,arr[i].info);
        }
    }

}
