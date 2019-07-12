#include<stdio.h>
int main()
{
  int count=1;
  char a[100];
  gets(a);
  int len=strlen(a);
  if(len>20)
    printf("Invalid Input");
  else
  {
  for(int i=0;i<len;i++)
  {
  if(a[i]==a[i+1])
  {
  count++;
  }
    else 
    {
    printf("%c%d",a[i],count);
      count=1;
    }
  }
}}