#include<iostream>
using namespace std;
int main()
{
  int x1,y1,x2,y2,d,c;
  std::cin>>x1>>y1>>x2>>y2;
  d=x1+x2;
  c=y1+y2;
  if(c>100){ c=c-100; d++; }
  std::cout<<d<<"\n";
  std::cout<<c;
}