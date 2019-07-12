#include<stdio.h>
#include<math.h>
int main()
{
  float a,b,c,determinant,root1,root2,real,img;
  scanf("%f %f %f",&a,&b,&c);
  determinant=b*b-4*a*c;
  if(determinant > 0)
  {
  root1=(-b+sqrt(determinant))/(2*a);
  root2=(-b-sqrt(determinant))/(2*a);
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else if(determinant==0){
    root1=root2=-b/(2*a);
    printf("root1 = %.2f  root2 = %.2f",root1,root2);
  }
  else 
  {
  real=-b/(2*a);
    img=sqrt(-determinant)/(2*a);
    printf("root1 = %.2f + %.2fi  root2 = %.2f - %.2fi",real,img,real,img);
  }
}