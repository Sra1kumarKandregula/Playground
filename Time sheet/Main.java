#include<iostream>
using namespace std;
int main()
{
  int x=0,h=0,s=0;
  for(int i=0;i<7;i++)
  {
    cin>>x;
    s=s+x*100;
    if(x>8) s=s+(x-8)*15;
    if(i==6) s=s+x*25;
    else if(i==0) s=s+x*50;
    else h=h+x;
  }
  if(h>40) s=s+(h-400)*25;
  cout<<s;
}
