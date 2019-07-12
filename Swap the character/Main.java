#include<stdio.h>
#include<string.h>
int main()
{
  char a[100],b[100],c[100];
  scanf("%s %s %s",a,b,c);
  int len=strlen(a);
  for(int i=0;i<len;i++)
  {
  if(a[i]=='a'||a[i]=='e'||a[i]=='i'||a[i]=='o'||a[i]=='u'||a[i]=='A'||a[i]=='E'||a[i]=='I'||a[i]=='O'||a[i]=='U')
    a[i]='$';
  }
  len=strlen(b);
  for(int i=0;i<len;i++)
  {
  if(b[i]=='a'||b[i]=='e'||b[i]=='i'||b[i]=='o'||b[i]=='u'||b[i]=='A'||b[i]=='E'||b[i]=='I'||b[i]=='O'||b[i]=='U')
   b[i]=b[i];
    else
    b[i]='#';
  }
  len=strlen(c);
  for(int i=0;i<len;i++)
  {
    if(c[i]>=97)
  c[i]=c[i]-32;
  }
  strcat(a,b);
  strcat(a,c);
  printf("%s",a);
}