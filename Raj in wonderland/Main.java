#include<iostream>
int main()
{
  int n;
  std::cin>>n;
  n=n%2;
  (n==0)?std::cout<<"Possible":std::cout<<"Not possible";
}