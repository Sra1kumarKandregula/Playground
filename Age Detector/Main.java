#include<iostream>
#include<cmath>
using namespace std;
int main()
{
  int x,y;
  std::cin>>x>>y;
  if(x<y)std::cout<<abs(x-y);
  else if(x>y && y>00) std::cout<<((100-x)+y);
  else std::cout<<100-x;
}