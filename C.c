#include<stdio.h>
int main()
{
    double a[1000],b[1000],c[1000],v[1000];
    int n,i;
    scanf("%d",&n);
    for(i=0;i<n;i++)
    {
     scanf("%lf",&a[i]);
     scanf("%lf",&b[i]);
     scanf("%lf",&c[i]);
    }
    for(i=0;i<n;i++)
    {
     v[i]=(a[i]*2+b[i]*3+c[i]*5)/10.0;
     printf("%.1lf\n",v[i]);
    }

    return 0;
}
