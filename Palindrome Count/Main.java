#include <bits/stdc++.h>
using namespace std;

int pal_count(string str){
	int n=str.length();
  stack <char> st;
  int count=0;
  
  string current="";
  string temp="";
  
  for(int i=0;i<n;i++){
  	if(str[i]!=' '){
    	st.push(str[i]);
    }
    else{
    	while(st.empty()==false){
        	char ch=st.top();
          current=current+ch;
          st.pop();
        }
      temp=current;
      reverse(temp.begin(),temp.end());
      if(temp!=current)
        ;
      else
        count++;
      current="";
      temp="";
    }
  }
  while(st.empty()==false){
        	char ch=st.top();
          current=current+ch;
          st.pop();
        }
      temp=current;
      reverse(temp.begin(),temp.end());
      if(temp!=current)
        ;
      else
        count++;
      current="";
      temp="";
    
  return count;
}

int main() 
{
   string str;
  getline(cin,str);
  
  cout<<pal_count(str);
}