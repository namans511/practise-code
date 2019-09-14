#include<stdio.h>
int main() {
	int deg1,deg2,counter,limit,sum;
	printf("enter degree of pol1 and pol2\n");
	scanf("%d",&deg1);
	scanf("%d",&deg2);
	int poly1[deg1+1];
	int poly2[deg2+1];
	limit=(deg1+1)*(deg2+1);
	int product[limit];
	int degree[limit];
	printf("enter coeffs in acending order of degree\n");
	for (int i = 0; i <= deg1; ++i)
	{
		scanf("%d",&poly1[i]);
	}
	printf("enter coeffs in acending order of degree\n");
	for (int i = 0; i <= deg2; ++i)
	{
		scanf("%d",&poly2[i]);
	}
	counter=0;
	for (int i = 0; i <= deg1; ++i)
	{
		for (int j = 0; j <= deg2; ++j,++counter)
		{
			product[counter]=poly1[i]*poly2[j];
			degree[counter]=i+j;
		}
	}
	printf("-------------------\n");
	for (int i = deg1+deg2; i >= 0; --i)
	{
		sum=0;
		for (int j = 0; j < limit; ++j)
		{
			if (degree[j]==i)
			{
				sum+=product[j];
			}
		}
		if (i!=0)
		{
			printf("%dx^%d+",sum,i);
		}
		else
			printf("%dx^%d\n",sum,i);
	}
}
