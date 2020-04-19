#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  int x;
  float y;
  std::cin>>x>>y;
  if(x==2) std::cout<<fixed<<setprecision(2)<<(y+(y*0.5));
  else if(x==3) std::cout<<fixed<<setprecision(2)<<2*y;
  else if(x==1)std::cout<<fixed<<setprecision(2)<<y;
  else std::cout<<"Number of items is more";
}