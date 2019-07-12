#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  a*=a;
  b*=b;
  printf("%.2f",sqrt(a+b));
  return 0;
}