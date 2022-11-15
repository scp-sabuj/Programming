#include <iostream>
using namespace std;
int main()
{
    int a=50;
    cout<<"the value of a:"<<a<<endl;
    int *b;
    b=&a;
    *b=100;
    cout<<"the value of a:"<<a<<endl;
    cout<<"the value of a:"<<&a<<endl;
    cout<<"the value of a:"<<*b<<endl;
    cout<<"the value of a:"<<b<<endl;
    return 0;
}
