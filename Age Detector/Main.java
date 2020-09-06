#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int by,cy;
  cin>>by>>cy;
  if(cy>=by)
    cout<<cy-by;
  else 
    cout<<100-by+cy;
}