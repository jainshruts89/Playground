#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int a=121,t=32;
  for(int i=0;i<n;i++){
  	cout<<a<<" ";
    a=a+104+t*i;
    
  }
}