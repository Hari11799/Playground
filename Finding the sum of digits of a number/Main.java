#include <stdio.h>
int main() {
  int a,sum;
  scanf("%d",&a);
    while(a>10)
    {
    sum=sum+a%10;
      a/=10;
    }
  printf("%d",sum+a);
	return 0;
}