#include<iostream>
using namespace std;
int main()
{
  double x,y;
  std::cin>>x>>y;
  if(y==13.30)
  {
    if(x>13) std::cout<<"$5.00";
    else std::cout<<"$2.00"; 
  }
  else 
  {
    if(x>13) std::cout<<"$8.00";
    else std::cout<<"$4.00";
  }
}