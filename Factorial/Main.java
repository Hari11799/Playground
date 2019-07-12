#include<stdio.h>

int main()
{
  long int a,fact=1;
  scanf("%ld",&a);
for(int i=1;i<=a;i++)
{
fact=fact*i;
}
  printf("%ld",fact);
}