#include <stdio.h>
int main() {
  char c;
  scanf("%c",&c);
  if((int)c>96)
    printf("%c",c-32);
  else
    printf("%c",c+32);
	return 0;
}