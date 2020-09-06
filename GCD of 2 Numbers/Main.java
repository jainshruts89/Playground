#include <iostream>
using namespace std;
int gcd1(int a, int b, int small){
	if(a%small==0 && b%small==0)
      return small;
  else
    return gcd1(a,b,small-1);

}

int main() 
{
   int a,b,small,gcd;
  cin>>a>>b;
  if(a<=b)
    small=a;
  else
    small=b;
  gcd=gcd1(a,b,small);
  cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<gcd;
}