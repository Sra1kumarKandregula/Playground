#include<iostream>
using namespace std;
int main()
{
  int r,c,n;
  std::cin>>r>>c>>n;
  if((n>r and n<=2*r) or ((n>r*c-2*r) and (n<=(r*c-r)))) std::cout<<"It is a mango tree";
  else std::cout<<"It is not a mango tree";
  
    
}
