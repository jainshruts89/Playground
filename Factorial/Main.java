#include<iostream>
int fact(int n){
	if(n==0)
      return 1;
  else
    return n*fact(n-1);
}

int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  std::cout<<"The factorial of "<<n<<" is "<<fact(n);
}