#include<iostream>
#include<vector>
using namespace std;

#define sz 100
bool flag[sz];
vector<int>prime;

void sieve()
{
    prime.push_back(2);
    for(int i=4;i<sz;i+=2)
        flag[i] = true;
    for(int i=3;i<sz;i+=2)
    {
        if(!flag[i])
        {
            prime.push_back(i);
            for(int j=i*i;j<sz;j+=i)
            {
                flag[j] = true;
            }
        }
    }
}

int main()
{
    sieve();
    int sz = prime.size();
    for(int i=0;i<sz;i++)
        cout<<prime[i]<<endl;

}
