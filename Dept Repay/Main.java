#include<iostream>
using namespace std;
int main()
{
  int pamount,roi,years;
  float interest;
  std::cin>>pamount;
  std::cin>>roi;
  std::cin>>years;
  std::cout<<((pamount*years*roi)/100)<<"\n";
  interest=((pamount*years*roi)/100);
  std::cout<<((pamount*years*roi)/100)+pamount<<"\n";
  std::cout<<(interest*2)/100<<"\n";
  std::cout<<((pamount*years*roi)/100)+pamount-((interest*2)/100);
}