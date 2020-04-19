#include<iostream>
using namespace std;
int main()
{
  int n,v,vols,s=0;
  cin>>n>>v;
  for(int i=0;i<n;i++){ cin>>vols; s=s+vols;}
  if(s>v) cout<<"NO";
  else cout<<"YES";
}