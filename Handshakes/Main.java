#include<iostream>
using namespace std;
int main()
{
  signed long int n,f=1,f2=1,x;
  std::cin>>n;
  x=n-2;
  for(int i=n;n>0;i--)
  {
    f=f*n;
    n--;
  }
  for(int i=x;x>0;i--)
  {
    f2=f2*x;
    x--;
  }
  std::cout<<((f)/(f2*2));
}