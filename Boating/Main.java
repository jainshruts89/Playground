#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,a,c;
  cin>>b>>a>>c;
  
  int count =a*75+c*30;
  if(count<=b)
    cout<<"Boat is stable";
  else
    cout<<"Boat will drow";
}