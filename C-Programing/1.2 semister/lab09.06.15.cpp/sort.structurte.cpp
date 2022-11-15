#include<iostream>
#include<string.h>
#include<vector>
using namespace std;

struct st{
    int info;
    char ch;
};

int main()
{

    string str;
    int cnt[150];
    st var, arr[100], temp;
    vector<char>ch;
    while(cin>>str)
    {
        memset(cnt,0,sizeof(cnt));
        ch.clear();
        for(int i=0;i<str.size();i++)
        {
            if(cnt[str[i]] == 0)
            {
                ch.push_back(str[i]);
            }
            cnt[str[i]]++;

        }
        for(int i=0;i<ch.size();i++)
        {
            var.ch = ch[i];
            var.info = cnt[ch[i]];
            arr[i] = var;
        }
        cout<<"Before sort"<<endl;

        for(int i=0;i<ch.size();i++)
        {
            cout<<arr[i].ch<<"-"<<arr[i].info<<endl;
        }

        for(int i=0;i<ch.size();i++)
        {
            for(int j=i+1;j<ch.size();j++)
            {
                if((arr[i].info < arr[j].info) || (arr[i].info == arr[j].info && arr[j].ch < arr[i].ch))
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        cout<<"After sort"<<endl;

        for(int i=0;i<ch.size();i++)
        {
            cout<<arr[i].ch<<"-"<<arr[i].info<<endl;
        }
    }

}

