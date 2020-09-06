#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,n;
  cin>>r>>c>>n;
  int count=0;
  
  for(int i=0;i<r; i++)
  {
  	for(int j=0; j<c; j++)
    {
    	if(i==0 && n==(j+1))
        {  cout<<"Yes";
         	count=1;
      break;}
      	else if((j==0 && n==(i*c+1)) ||(j==4 && n==(i*c+1)))
        { cout<<"Yes";
         	count=1;
      		break;}
      	
    }
  }
  if(count==0)
    cout<<"No";
}