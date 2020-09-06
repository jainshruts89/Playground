#include<iostream>
using namespace std;

int main(){
  // Type your code here
  int n,girl=0,boy=0;
  cin>>n;
  int *ptr=(int*)calloc(n,sizeof(int));
  for(int i=0;i<n;i++)
    cin>>*(ptr+i);
  for(int i=0;i<n;i++)
  {
  	if(*(ptr+i)%2==0)
      girl++;
    else
      boy++;
      
  }
  cout<<boy<<endl<<girl;
  return 0;
}