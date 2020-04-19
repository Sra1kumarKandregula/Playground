
  #include<iostream>
using namespace std;
int main()
{
  int n,count=0;
  std::cin>>n;
  if(n==1){ std::cout<<"1\n"; std::cout<<count; }
  else{
    std::cout<<n<<"\n";
  while(n>0 && n!=1){
    if(n%2==0){ n=n/2; std::cout<<n<<"\n"; count++; }
    else{ n=3*n+1; std::cout<<n<<"\n"; count++; } }
 std::cout<<count; }
}
