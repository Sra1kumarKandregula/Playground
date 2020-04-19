#include<iostream>
int main()
{
  int a,b,c,s=0,i,div;
  std::cin>>a>>b;
  c=a+b;
  for(i=1;i<c;i++)
  {
    div=c%i;
    if(div==0){ s=s+i; }
  }
  if(s==c) std::cout<<"They can read the message";
    else std::cout<<"They can't read the message";
}