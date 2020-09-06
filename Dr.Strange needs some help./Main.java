#include <iostream>
using namespace std;

int main() 
{
 int n,m,req;
  cin>>n>>m>>req;
  int temp=1;
  
  for(int i=0;i<m;i++){
  	temp=temp*n;
  }
  if(temp>=req){
  	cout<<"Doctor, you can proceed with your experiment.";
  }
  else
    cout<<"Sorry Doctor! You need more bacteria.";
}