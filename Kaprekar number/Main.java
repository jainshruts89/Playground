#include<iostream>
#include<math.h>

using namespace std;
int main()
{
  //Type your code here.
  int n,temp,count=0;
  cin>>n;
  temp=n;
  int sqr=n*n;
  while(n!=0){
  	count=count+1;
    n=n/10;
  }
  
  int right=sqr%int(pow(10,count));
  int left=sqr/int(pow(10,count));
  int res=right+left;
  if(res==temp)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
  
}