#include <iostream>
#include <algorithm>
using namespace std;


int main() 
{
   // Try out your code here
    int n,k;
  cin>>n>>k;
  int arr[n];
  for(int i=0;i<n;i++)
    cin>>arr[i];
  sort(arr,arr+n);
  int sum=0,j=n-1;
  for(int i=0;i<k;i++)
    sum=sum+arr[j--];
  cout<<sum;
  
}