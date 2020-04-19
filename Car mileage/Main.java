#include<iostream>
using namespace std;
int main()
{
  float mileage;
  int litres,distance;
  std::cin>>mileage>>litres>>distance;
  if((mileage*litres)<distance) std::cout<<"Cannot reach";
  else std::cout<<"Can reach";
}