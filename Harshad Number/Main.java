#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,temp;
  
  cin>>n;
  temp=n;
  int sum=0;
  while(n!=0){
  	sum=sum+n%10;
    n=n/10;
  }
  if(temp%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}