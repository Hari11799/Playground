#include<stdio.h>
int main()
{
  int n,f,s,k,j,a1ind=-1,a2ind=-1;
  scanf("%d",&n);
  int a[n];
  for(int i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }
  scanf("%d %d",&f,&s);
  for(int i=0;i<n;i++)
  {
  if(a[i]==f && a1ind==-1)
  {
    a1ind=i;
  }
  else if(a[i]==s && a2ind==-1)
  {
    a2ind=i;
  }}
  printf("Element 1 index = %d\nElement 2 index = %d",a1ind,a2ind);
  return 0;
    }
