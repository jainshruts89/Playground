#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  int a=1,t=2;
  for(int i=0;i<n;i++){
  	if(i%2==0){
      for(int j=0;j<=i;j++){
        if(j==0)
      		cout<<a;
        else
          cout<<"*"<<a+j;
      }
      cout<<endl;
      a=a+t;
    
    }
    else{
    	for(int j=0;j<=i;j++){
        	if(j==0)
              cout<<a;
          else
            cout<<"*"<<a-j;
        }
      cout<<endl;
      t=t+4;
      a=a+1;
    }
  }
}