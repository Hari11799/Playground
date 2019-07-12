#include <stdio.h>
#include<math.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  if(b<0)
    printf("Wrong input");
  else
  {
  printf("%.0lf",pow(a,b));
  }
    return 0;
}