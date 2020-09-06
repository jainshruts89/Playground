#include<iostream>
#include<algorithm>
using namespace std;
int main()
{
  //Type your code here.
    

 int a,b,c;

 cin>>a>>b>>c;

 int sum=6;

 int gp=0,sp=0;

 //finding position of the largest number

 if(a>b && a>c)

  gp=1;

 else if(b>a && b>c)

  gp=2;

 else

  gp=3;

 //finding position of the smallest number

 if(a<b && a<c)

  sp=1;

 else if(b<a && b<c)

  sp=2;

 else

  sp=3;

int x=gp+sp;//adding the positon of largest and smallest number

int y=sum-x;//subustracting it from the positions total(1+2+3=6)
int gcd,i;
for(i=1; i <= a && i <= b && i <=c; ++i)
    {
        // Checks if i is factor of both integers
        if(a%i==0 && b%i==0 && c%i==0)
            gcd = i;
    }
    

 switch(y)

 {

  case 1:cout<<"The treasure is in box which has number "<<a<<

   "\nThe code to open the box is "<<gcd;

 break;

 case 2:cout<<"The treasure is in box which has number "<<b<<

   "\nThe code to open the box is "<<gcd;

 break;

 case 3:cout<<"The treasure is in box which has number "<<c<<

   "\nThe code to open the box is "<<gcd;

 break;

}

return 0;  

}






