#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2;
  cin>>d1>>c1>>d2>>c2;
  int cent,dollar;
  dollar=d1+d2;
  cent=c1+c2;
  while(cent>100){
  	dollar=dollar+1;
    cent=cent-100;
  }
  cout<<dollar<<endl<<cent;
}