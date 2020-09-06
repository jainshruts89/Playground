#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
  int x,y;
  cin>>x>>y;
  for(int i=x;i<y;i++){
    int sum=0;
    
  	for(int j=1;j<i;j++){
      	if(i==1)
          continue;
    	else if(i%j==0)
          sum=sum+j;
    }
    if(sum==i)
      cout<<i<<" ";
  }
    
  return 0;
}