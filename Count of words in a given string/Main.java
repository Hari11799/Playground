#include<stdio.h>
#include<string.h>
int main()
{
  int count=1;
  char a[100];
  gets(a);
  int len=strlen(a);
  for(int i=0;i<len;i++)
  {
  if(a[i]!=' '&& a[i+1]==' ')
    ++count;
  }
  printf("%d",count);
}