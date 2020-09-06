#include<iostream>
using namespace std;
int main()
{
  // Type your code here
  int n,arr[20],max=0;
  cin>>n;
  for(int i=0;i<n;i++){
  	cin>>arr[i];
  }
  for(int i=0;i<n;i++){
  	if(arr[i]>max)
      max=arr[i];
      
  }
  cout<<max;
}