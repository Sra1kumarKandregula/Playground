#include<iostream>
using namespace std;
int main()
{
  int x,y,z,m;
  std::cin>>x>>y>>z;
  m=y*75+z*30;
  if(m<=x) std::cout<<"Boat is stable";
  else std::cout<<"Boat will drow";
}