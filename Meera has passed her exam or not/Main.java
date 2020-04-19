#include<iostream>
using namespace std;
int main()
{
  int n,x,flag;
  cin>>n;
  int a[n];
  for(int i=0;i<n;i++) cin>>a[i];
  cin>>x;
  for(int j=0;j<n;j++) { if(a[j]==x) flag=1;}
  if(flag==1) cout<<"She passed her exam";
  else cout<<"She failed";
                        
}
