#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n>0 && n<=r)||(n>0 && n<c)&&(n>0 && n<c*r)||(n%r==1)) std::cout<<"Yes";
  else std::cout<<"No";
}