#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  
  int r,c,i,j,sum=0;
  
  cin>>r>>c;
  int a[r][c];
  
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  
  for(i=0;i<r;i++){
    for(j=0;j<c;j++) {
    	if(i==0)
          sum=sum+a[i][j];
      else if(i==r-1)
        sum=sum+a[i][j];
      else if(i==j)
        sum=sum+a[i][j];
    }
  
  }
  cout<<"Sum of Zig-Zag pattern is "<<sum;
}