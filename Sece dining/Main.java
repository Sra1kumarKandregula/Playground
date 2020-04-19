#include<iostream>
#include<string>
using namespace std;
int main()
{
  int x;
  string door;
  getline(cin,door);
  std::cin>>x;
  if(door=="front")
  {
    if(x==1) std::cout<<"Left Handed";
    else std::cout<<"Right Handed";
  }
  else
  {
    if(x==1) std::cout<<"Right Handed";
    else std::cout<<"Left Handed";
  }
}