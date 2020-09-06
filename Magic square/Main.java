#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n, i,j,add1=0,add2=0;
  cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      cin>>a[i][j];
  for(i=0;i<n;i++)
    add1=add1+a[i][i];
  for(i=n-1;i>=0;i--)
    add2=add2+a[n-1-i][i];
  if(add1==add2)
    cout<<"Yes";
  else
    cout<<"No";
}