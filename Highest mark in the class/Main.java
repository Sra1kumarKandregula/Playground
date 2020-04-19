#include<iostream>
int main()
{
  int n,l;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++) std::cin>>a[i];
  for(int j=0;j<n;j++) 
  {
    if(a[0]<a[j]) a[0]=a[j];
    }
  std::cout<<a[0];
}