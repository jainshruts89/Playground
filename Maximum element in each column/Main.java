#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,max=0;
  cin>>r>>c;
  int a[r][c];
  
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  
  for(j=0;j<c;j++){
    max=a[0][j];
  	for(i=0;i<r;i++){
    	if(a[i][j]>max)
          max=a[i][j];
    
    }
    cout<<max<<endl;
    
  }
}