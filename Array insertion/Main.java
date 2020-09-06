#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,pos,value;
  cout<<"Enter the number of elements in the array"<<endl<<"Enter the elements in the array"<<endl;
  
  
  cin>>n;
  int a[n+1];
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<endl;
  
  cin>>pos;
  if(pos<=n){
  cout<<"Enter the value to insert"<<endl;
  cin>>value;
  for(i=n;i>=pos-1;i--)
    a[i]=a[i-1];
  a[pos-1]=value;
  cout<<"Array after insertion is"<<endl;
  for(i=0;i<=n;i++)
    cout<<a[i]<<endl;
  }
  else
    cout<<"Invalid Input";
  
}