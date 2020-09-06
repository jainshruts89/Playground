#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,m,small=0;
  cin>>n>>m;
  if(n<m)
    small=n;
  else
    small=m;
  if(small%2==0)
    cout<<"Mani Iyer";
  else
    cout<<"Arun Gupta";
  
}