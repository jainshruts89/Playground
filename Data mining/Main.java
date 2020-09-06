#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,n1=0,n2=0;
  cin>>n;
  
  while(n!=0){
  	int temp=n%10;
    if(temp%2==0)
      n1=n1+temp;
    else
      n2=n2+temp;
    n=n/10; 
  }
  if(n1==n2)
    cout<<"Yes";
  else
    cout<<"No";
}