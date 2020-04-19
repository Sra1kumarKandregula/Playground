#include<iostream>
using namespace std;
int main()
{
  int famount,samount,aamount,fcost,fdiscount,fshipping,acost,adiscount,ashipping,scost,sdiscount,sshipping;
  std::cin>>fcost>>fdiscount>>fshipping>>scost>>sdiscount>>sshipping>>acost>>adiscount>>ashipping;
  famount=(fcost-(fcost*fdiscount/100)+fshipping);
  samount=(scost-(scost*sdiscount/100)+sshipping);
  aamount=(acost-(acost*adiscount/100)+ashipping);
  std::cout<<"In Flipkart Rs."<<famount<<"\n";
  std::cout<<"In Snapdeal Rs."<<samount<<"\n";
  std::cout<<"In Amazon Rs."<<aamount<<"\n";
  if(famount<=samount && famount<=aamount) std::cout<<"He will prefer Flipkart";
  else if(samount<famount && samount<aamount) std::cout<<"He will prefer Snapdeal";
  else std::cout<<"He will prefer Amazon";
  
}