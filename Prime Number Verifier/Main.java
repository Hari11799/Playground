// INCLUDE HEADER FILES NEEDED BY YOUR PROGRAM
// SOME LIBRARY FUNCTIONALITY MAY BE RESTRICTED
// DEFINE ANY FUNCTION NEEDED
// FUNCTION SIGNATURE BEGINS, THIS FUNCTION IS REQUIRED
#include <stdio.h>
// Main function
int main()
{
  int a,temp=0;
  scanf("%d",&a);
  for(int i = 2; i <= a/2; ++i)
  {
  if(a%i==0)
  {  temp=1;
    break;
  }}
  if(a==1||a==0)
    printf("neither");
  else if(temp==0)
    printf("prime");
  else if(temp==1) 
    printf("composite");
   return 0;
}