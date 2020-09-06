#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int n;
  	cin>>n;
  	int a=6,t=5;
  	for(int i=1;i<=n;i++){
    	cout<<a<<" ";
      	a=a+t*i;
    }
    return 0;
}