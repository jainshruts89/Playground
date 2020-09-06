#include<iostream>
int main()
{
  // Type your code here
  int n;
  std::cin>>n;
  int count=0;
  do{
  	count+=1;
    n=n/10;
    
  }while(n>0);
  std::cout<<count;
}