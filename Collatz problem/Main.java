#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int count=0;
  while(n>1)
  {
    cout<<n<<endl;
  	if(n%2==0)
    {
    	n=n/2;
      	count+=1;
    }
    else
    {
    	n=3*n+1;
      	count+=1;
    }
  }
  cout<<1<<endl<<count;
}