#include<iostream>
int main()
{
  int n,f,i;
  std::cin>>n;
  do{
    f=n%10;
    ++i;
    n=n/10;
  }while(n>0);
  std::cout<<i;
}