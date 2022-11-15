#include<iostream>
#include<vector>

using namespace std;

int main()
{
    vector<char>vectorStr[20];
    int arr[20][20],n,k;
    char str[20],str2[20];
    cout<<"Enter the number of vertex : ";
    cin>>n;
    cout<<"Enter the vertex's : "<<endl;
    for(int i=1; i<=n; i++)
    {
        cin>>str[i];
    }
    cout<<"Enter the Adjecent List :"<<endl<<endl;
    for(int i=1; i<=n; i++)
    {

        cout<<"Enter the adjecent elements number of : "<<str[i]<<" : ";
        cin>>k;
        cout<<"Enter the adjecent of --> "<<str[i]<<" : "<<endl;
        for(int j=1; j<=k; j++)
        {
            cin>>str2[j];
            vectorStr[i].push_back(str2[j]);
        }
        cout<<endl;
    }
    cout<<endl<<endl;

    for(int i=1; i<=n; i++)
    {
        cout<<"The adjecent of --> "<<str[i]<<" is : ";
        for(int j=0; j<vectorStr[i].size(); j++)
        {
            cout<<vectorStr[i][j];
        }
        cout<<endl;
    }
    return 0;
}
