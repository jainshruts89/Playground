#include <iostream>
using namespace std;

int main() 
{
   int n1,n2,n3,gcd,small,res=1;
  cin>>n1>>n2>>n3>>gcd;
  
  if(n1<n2 ){
    if(n1<n3)
      small=n1;
    else
      small=n3;
    
  }
  else
    small=n2;
  while(small>1){
  	if(n1%small==0 && n2%small==0 && n3%small==0){
    	res=small;
      	break;
    }
    small--;
  }
  if(res==gcd)
    cout<<"Answer is correct.";
  else
    cout<<"Answer is wrong.";
  
}