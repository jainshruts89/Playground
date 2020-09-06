#include <iostream>
#include<string.h>
using namespace std;
int pal(string str){
	int i=0;
  int n=str.length()-1;
  while(n>i){
  	if(str[i++]!=str[n--])
     {
      return 0;
    }
    
      }
  return 1;

}

int main(){
	string str;
  int flag=0;
  getline(cin,str);
  cout<<pal(str);
  
   
}