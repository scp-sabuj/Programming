#include<iostream>
#include<vector>

using namespace std;

int NumberOfDigit(int num)
{

    int cnt = 0;
    while(num)
    {
        cnt++;
        num/=10;
    }

    return cnt;

}
int main()
{
    int n,arr[100], arr2[100], mx , factor;

    while(cin>>n)
    {
        vector<int>vectorArr[10];
        mx = -1000;

        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
            arr2[i] = arr[i];
            if(mx<arr[i]) mx = arr[i];
        }

        factor = 10;
        int cnt = NumberOfDigit(mx);

        for(int k=0;k<cnt;k++)
        {
            for(int i=0;i<n;i++)
            {
                int digit = arr2[i]%10;
                vectorArr[digit].push_back(arr[i]);
            }
            int l = 0;
            for(int i=0;i<10;i++)
            {
                for(int j=0;j<vectorArr[i].size();j++)
                {
                    arr[l] = vectorArr[i][j];
                    arr2[l] = arr[l]/factor;
                    l++;
                }
                vectorArr[i].clear();
            }

            factor*=10;
        }

        for(int i=0;i<n;i++)
        {
            cout<<arr[i]<<" ";
        }
        cout<<endl;
    }

}
/*
5
543
43
23
3
2

3
3 2 1

3
43 0 543

*/
