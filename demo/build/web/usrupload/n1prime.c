#include<stdio.h>
#include<math.h>
void main()
{
    long long int i,n2,n1,n,p,uu=0,gy=0;
//prlong long intf("enter n1 and n2");
    scanf("%lld%lld",&n1,&n2);
    n=n1;
    while(n<=n2)
    {
        p=1;
        if(n%2==0)
            p=0;
        if(n==2||n==3||n==5||n==7)
            p=1;
        for(i=3; i<=(long long int)sqrt(n); i=i+2)
        {
            if(n%i==0)
            {
                p=0;
                break;
            }
        }

        if(p==1&&n!=1){
           // prlong long intf("%d\n",n);
           long long int qqq=n;
           while(qqq!=0)
           {
               if(qqq%10==2||qqq%10==3||qqq%10==5||qqq%10==7)
                uu=1;
                else {uu=0;break;
                }
               qqq=qqq/10;
           }

        }
        if(uu==1)
           // printf("%d\n",n);
           gy++;
            uu=0;
        n++;
    }
    printf("%lld",gy);
}



