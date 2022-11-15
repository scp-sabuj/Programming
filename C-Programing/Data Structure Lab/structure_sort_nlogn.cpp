
#include<iostream>
#include<string.h>
#include<vector>
#include<stdlib.h>
using namespace std;

struct st{
    int info;
    char ch;
};

int compare(const void *a, const void *b)
{
    st *var1 = (st *)a;
    st *var2 = (st *)b;
    if(var1->info > var2->info) return -1;
    else if(var1->info == var2->info)
    {
        if(var1->ch < var2->ch) return -1;
    }
    return 1;
}

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

        qsort(arr, ch.size(), sizeof(st), compare);

        cout<<"After sort"<<endl;

        for(int i=0;i<ch.size();i++)
        {
            cout<<arr[i].ch<<"-"<<arr[i].info<<endl;
        }
    }

}
