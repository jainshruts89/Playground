#include<iostream>
using namespace std;
int type(int n, int a[]){
	int even=0,odd=0,i;
  for(i=0;i<n;i++){
  	if(a[i]%2==0)
      even+=1;
    else
      odd+=1;
  }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
  
}
int main()
{
  //Type your code here.
  int n,i;
  cout<<"Enter the number of elements in the array"<<endl;
  
  cin>>n;
  int a[n];
  cout<<"Enter the elements in the array"<<endl;
  for(i=0;i<n;i++)
    cin>>a[i];
  int x=type(n,a);
  if(x==1)
    cout<<"The array is Even";
  else if(x==2)
    cout<<"The array is Odd";
  else
    cout<<"The array is Mixed";
}