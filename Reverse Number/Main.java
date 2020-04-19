#include <iostream>
int main() 
{
	int n,f;
  std::cin>>n;
  while(n>0){
    f=n%10;
    std::cout<<f;
    n=n/10;
  }
	return 0;
}