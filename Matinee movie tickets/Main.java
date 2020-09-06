#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int age;
  float t;
  cin>>age>>t;
  if(t<=12.00)
  {
    if(age<=13)
      cout<<"$4.00";
    else
      cout<<"$8.00";
    
  }
  else{
  	if(age<=13)
      cout<<"$2.00";
    else
      cout<<"$5.00";
  }
    
}