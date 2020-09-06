#include <iostream>
using namespace std;
int root(int n){
  int temp =n,count=0;
	if(n/10==0)
      return n;
  else{
    while(temp!=0){
      count=count+temp%10;
      temp=temp/10;
     
    }
    return root(count);
  	
  }
}

int main() 
{
  int n;
  cin>>n;
  cout<<root(n);
}