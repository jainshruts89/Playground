#include <iostream>
using namespace std;
int LCS(string X, string Y){
	int X_len = X.length();
  	int Y_len = Y.length();
  int table[X_len+1][Y_len+1];
  for(int i=0; i<=X_len;i++){
  	for(int j=0;j<=Y_len;j++){
    	if(i==0 || j==0)
          table[i][j]=0;
      else if(X[i-1]==Y[j-1])
        table[i][j]=1+table[i-1][j-1];
      else
        table[i][j]=max(table[i][j-1],table[i-1][j]);
    }
  }
  return table[X_len][Y_len];
}

int main() 
{
    string X,Y;
  	getline(cin,X);
  	getline(cin,Y);
  cout<<LCS(X,Y);
}