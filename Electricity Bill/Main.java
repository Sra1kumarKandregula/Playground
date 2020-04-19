#include<iostream>
using namespace std;
int main()
{
  float n,u,c;
  std::cin>>n;
  if(n<=200) u=0.5;
  else if(n<=400) {u=0.65; c=100;}
  else { u=1.25; c=425; }
  std::cout<<"Rs."<<int((n*u)+c);
}