#include<stdio.h>
int main()
{
  int a,sum;
  scanf("%d",&a);
  
  sum=a%10;
  while(a>10)
  {
    a/=10;
  }
  printf("%d",sum+a);
  return 0;
}