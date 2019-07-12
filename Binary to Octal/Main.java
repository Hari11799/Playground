#include<stdio.h>
#include<math.h>
int main()
{
  long int n,dec,i=0,octal,rem;
  int oct[100];
  scanf("%ld",&n);
  while(n>0)
  {
  rem=n%10;
  dec=dec+rem*pow(2,i);
    n/=10;
    i++;
  }
  i=0;
  while(dec>0)
  {
  oct[i++]=dec%8;;
    dec/=8;
  }
  for(int j=i-1;j>=0;j--)
  {
  printf("%d",oct[j]);
}}