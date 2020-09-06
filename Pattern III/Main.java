#include <iostream>
using namespace std;

int main() 
{
  int n;
  cin>>n;
  for(int i=1;i<=n;i++){
  	for(int j=0;j<i;j++){
    	if(j==0)
          cout<<i;
      else
        cout<<"*"<<i;
    }
    cout<<endl;
  }
  for(int i=n;i>0;i--){
  	for(int j=0;j<i;j++){
    	if(j==0)
          cout<<i;
      else
        cout<<"*"<<i;
    }
    cout<<endl;
  }
}