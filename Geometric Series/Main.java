#include<stdio.h>
int main()
{
  int n,ans;
  scanf("%d",&n);
  if(n%2==0)
  {
  n=n/2-1;
  ans=pow(3,n);
  printf("%ld",ans);
  }
  else if(n%2==1)
  {
  n=n/2;
    ans=pow(2,n);
  printf("%ld",ans);
  }
  return 0;
}