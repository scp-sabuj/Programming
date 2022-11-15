#include<iostream>
#include<vector>

using namespace std;

int main()
{
    vector<char>vectorStr[20];
    int n,k,f=0,r=0;
    char str[20],ch,queue_a[50];
    cout<<"Enter the number of vertex : ";
    cin>>n;
    for(int i=1; i<=n; i++)
    {
        cout<<"Enter the vertex, adjecent number and adjecent : ";
        cin>>str[i]>>k;
        for(int j=1; j<=k; j++)
        {
            cin>>ch;
            vectorStr[i].push_back(ch);
        }
        cout<<endl;
    }

    cout<<endl<<endl;
    cout<<"Enter the root : ";
    cin>>queue_a[1];

    for(int i=1; i<=n; i++)
    {

        cout<<"The adjecent of --> "<<str[i]<<" is : ";
        for(int j=0; j<vectorStr[str[i]].size(); j++)
        {
            cout<<vectorStr[i][j];

        }
        cout<<endl;
    }
    return 0;
}
