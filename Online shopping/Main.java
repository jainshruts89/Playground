#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fs,sa,sd,ss,aa,ad,as;
  cin>>fa>>fd>>fs>>sa>>sd>>ss>>aa>>ad>>as;
  int fc,sc,ac;
  fc=fa-(fa*fd/100)+fs;
  sc=sa-(sa*sd/100)+ss;
  ac=aa-(aa*ad/100)+as;
  cout<<"In Flipkart Rs."<<fc<<endl;
  cout<<"In Snapdeal Rs."<<sc<<endl;
  cout<<"In Amazon Rs."<<ac<<endl;
  
  if(fc<=sc && fc<=ac)
    cout<<"He will prefer Flipkart";
  else if(sc<=fc && sc<=ac)
    cout<<"He will prefer Snapdeal";
  else if(ac<=fc && ac<=sc)
    cout<<"He will prefer Amazon";
}