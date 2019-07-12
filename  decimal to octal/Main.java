#include<stdio.h>
int main()
{
  int a[20],n,i=0;
  scanf("%d",&n);
  while(n>0)
  {
    a[i]=n%8;
    n/=8;
  	i++;
  }
  for(int j=i;j>0;j--)
  {
  printf("%d",a[j-1]);
  }
  return 0;
}