#include<stdio.h>
int main()
{
  int n,t;
  scanf("%d",&n);
  if(n%2==1)
  {
    
   printf("%d",n-1); 
  }
  else if(n%2==0)
  {
    n=(n/2)-1;
    
  printf("%d",n);
}}