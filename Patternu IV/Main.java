#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n;
  cin>>n;
  
  for(int i=1;i<=n;i++){
  	if(i%2==0){
      cout<<i+1;
      for(int j=1;j<n;j++)
        cout<<i;
      cout<<endl;
    
    }
    else
    {
    	for(int j=1;j<n;j++)
          cout<<i;
      cout<<i+1<<endl;
    }
  }
    return 0;
}