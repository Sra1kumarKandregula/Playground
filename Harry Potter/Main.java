#include<iostream>
using namespace std;
int main()
{
  int n,x;
  std::cin>>n;
  x=n/10;
  x=x/10;
  x=x/10;
  n=n%10;
  std::cout<<x+n;
}