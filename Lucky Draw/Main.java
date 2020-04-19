#include<iostream>
int main()
{
  int n, i;
  bool isPrime = true;
  std::cin >> n;
  if(n==1) std::cout<<"Not eligible";
  else{
  for(i = 2; i <= n / 2; ++i)
  {
      if(n % i == 0)
      {
          isPrime = false;
          break;
      }
  }
  if (isPrime)
      std::cout << "Eligible";
  else
      std::cout << "Not eligible";
  }
}