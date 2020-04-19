#include<iostream>
#include<cstdlib>
using namespace std;
int main(){
  int *a;
  int n,m=0,f=0;
  cin>>n;
  a=(int *)malloc(n*sizeof(int));
  int arr[n];
  for(int i=0;i<n;i++){ cin>>*(arr+i); }
  for(int j=0;j<n;j++){ if(arr[j]%2==0){f++;}
                       else {m++;}}
  cout<<m<<"\n";
  cout<<f;
  return 0;
}