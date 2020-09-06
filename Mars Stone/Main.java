#include <iostream>
#include<algorithm>
using namespace std;

int main() 
{
   int n,m,i;
  cin>>m>>n;
  int x=m-n;
  int mars[m],earth[n],unique[x],j=0,index=0,count=0,weight=0;
  
  for(i=0;i<m;i++)
    mars[i]=i+1;
  for(i=0;i<n;i++)
    cin>>earth[i];
  sort(earth,earth+n);
  
  for(i=0;i<m;i++){
  	if(j<n && mars[i]==earth[j])
      j++;
    else
      unique[index++]=mars[i];
    
  }
  
  for(i=0;i<x;i++)
  {
  	weight=weight+unique[i];
    
    
    if(weight<=m)
    	count++;
    else
      break;
  }
  cout<<count;
}