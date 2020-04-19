#include<iostream>
using namespace std;
int main()
{
  int n,x,f,s=0;
  std::cin>>n;
  x=n;
  while(n>0)
  {
    f=n%10;
    s=s+f;
    n=n/10;
  }
  if(x%s==0) std::cout<<"Harshad Number";
  else std::cout<<"Not Harshad Number";
}