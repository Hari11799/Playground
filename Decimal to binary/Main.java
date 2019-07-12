#include<stdio.h>
int main()
{
  int n,a[20],i;
  scanf("%d",&n);
  while(n>0)
  {
  if(n%2==0)
  {
    n/=2;
    a[i]=0;
  }
    else if(n%2==1)
    { 
      a[i]=1;
      n/=2;
    }
    i++;
  }
  for(int j=i;j>0;j--)
  {
  printf("%d",a[j-1]);
  }
  return 0;
}