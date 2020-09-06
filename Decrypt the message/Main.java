#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int a,b,res=0;
  cin>>a>>b;
  int sum=a+b;
  for(int i=1; i<sum; i++){
  	if(sum%i==0)
      res=res+i;
  }
  if(res==sum)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  	
  return 0;
}