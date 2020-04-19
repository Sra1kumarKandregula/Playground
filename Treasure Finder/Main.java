#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,l,sd,h;
  std::cin>>a>>b>>c;
  if(a >= b && a >= c)
    {
        if(b >= c)
        {
            l=b;
        }
        else
        {
            l=c;
        }
    }
    else if(b >= a && b >= c)
    {
        if(a >= c)
        {
            l=a;
        }
        else
        {
            l=c;
        }
    }
    else if(a >= b)
    {
        l=a;
    }
    else
    {
        l=b;
    }
     std::cout<<"The treasure is in box which has number "<<l<<"\n";
   sd=a<b?(a<c?a:c):(b<c?b:c);
 
for (h=sd;h>=1;h--)
  {
   if (a%h==0 && b%h==0 && c%h==0)
  break;
  }
  std::cout<<"The code to open the box is "<<h;
}