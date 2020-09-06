#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   	int n;
  	cin>>n;
  	int a=0,t=2;
  	for(int i=0;i<n;i++){
    	if(i%2==0){
        	cout<<a<<" ";
          	a=a+t;
          	
        }
      	else
        {
        	cout<<a<<" ";
          	t=t+4;
          	a=a+t;
        
        }
    }
   return 0;
}