#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,rmax=0,cmax=0,rsum=0,csum=0,x,y;
  
  cin>>r>>c;
  
  int a[r][c];
  
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      cin>>a[i][j];
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++){
    for(j=0;j<c;j++){
      rsum=rsum+a[i][j];
    }
    if(rsum>rmax){
      rmax=rsum;
      x=i+1;
    }
    cout<<rsum<<" ";
    rsum=0;
    
}
  cout<<endl<<"Row "<<x<<" has maximum sum"<<endl;
  
  cout<<"Sum of columns is ";
  for(j=0;j<c;j++){
    for(i=0;i<r;i++){
      csum=csum+a[i][j];
    }
    if(csum>cmax){
      cmax=csum;
      y=j+1;
    }
    cout<<csum<<" ";
    csum=0;
    
}
  cout<<endl<<"Column "<<y<<" has maximum sum";

}