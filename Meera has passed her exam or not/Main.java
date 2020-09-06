#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,arr[20],reg,flag=0;
  cin>>n;
  
  for(int i=0;i<n;i++)
    cin>>arr[i];
  cin>>reg;
  
  for(int i=0;i<n;i++){
  	if(reg==arr[i]){
      flag=1;
      break;
    }
  }
  if(flag==1)
    cout<<"She passed her exam";
  else
    cout<<"She failed";
}