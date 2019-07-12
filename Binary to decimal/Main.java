#include<stdio.h>
int main()
{
  long int a,i=0,n,sum=0,rem;
  scanf("%ld",&a);
  while(a!=0)
  {
    rem=a%10;
  sum=sum+rem*pow(2,i);
    a/=10;
    i++;
  }
  printf("%d",sum);
  return 0;
}