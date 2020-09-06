#include<iostream>
using namespace std;

int main(){
	string str,s="";
  	char ch;
  	getline(cin,str);
  	cin>>ch;
  
  for(int i=0;i<str.length();i++){
    if(ch==str[i])
      continue;
  else
    s=s+str[i];
}
  cout<<s;
}