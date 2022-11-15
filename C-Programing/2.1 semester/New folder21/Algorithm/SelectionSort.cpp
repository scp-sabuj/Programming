#include<stdio.h>
#include<iostream>
using namespace std;

int main()
{

    int n, arr[100];

    while(cin>>n)
    {
        for(int i=0;i<n;i++)
        {
            cin>>arr[i];
        }

        for(int i=0;i<n-1;i++)
        {
            int min = arr[i+1];
            int j = i+1;
            for(int k= i+2;k<n;k++)
            {
                if(arr[k]<min)
                {
                    min = arr[k];
                    j = k;
                }
            }
            if(arr[i]>min)
            {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        for(int i = 0;i<n;i++) cout<<arr[i]<<" ";
        cout<<endl;
    }

}
