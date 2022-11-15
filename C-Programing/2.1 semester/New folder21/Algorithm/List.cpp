#include<iostream>
#include<stdio.h>
#include<string.h>
#include<vector>
using namespace std;

int main()
{
    int n,m;
    char a[150],b;
    vector<char>arr[150];
    vector<char>ar[10];
    while(cin>>n)
    {
        for(int i=0;i<n;i++)
        {
            scanf(" %c%d",&a[i],&m);
            for(int j=0;j<m;j++)
            {
                scanf(" %c",&b);
                arr[a[i]].push_back(b);
            }
        }
        for(int i=0;i<n;i++)
        {
            cout<<a[i]<<"-";
            for(int j=0;j<arr[a[i]].size();j++)
            {
                cout<<arr[a[i]][j]<<" ";
            }
            cout<<endl;
        }
    }

}

/*
5
a 3
b c d
b 3
a c e
c 3
a b e
d 1
a
e 2
b c
*/

