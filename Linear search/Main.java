#include<stdio.h>
int main()
{
  int n,k,i=0,t=0;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
  scanf("%d",&a[i]);
  }
  scanf("%d",&k);
  for(i=0;i<n;i++)
  {
    if(a[i]==k)
    {  printf("%d",i+1);
    t=1;
    }
  }
  if(t==0)
        printf("%d isn't present in the array.",k);
  
  return 0;
}