#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
	int n;
  	cin>>n;
  	int a=121;
  	int t=0;
  	for(int i=0;i<n;i++){
    	cout<<a<<" ";
      	a=a+104+t;
      	t=t+32;
    }
	return 0;
}