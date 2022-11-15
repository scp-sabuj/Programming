#include<stdio.h>
int main()
{
    int n,i,j,a[100];
   // while(true)
    //{
        scanf("%d",&n);
        for(i=0; i<n; i++)
        {
            scanf("%d\n",&a[i]);
        }
        printf("The distinct numbers are:\n");
        for(i=0; i<n; i++)
        {
            for(j=i+1; j<n; j++)
            {
                if(a[i]==a[j])
                    break;
            }
            if(j==n)
                printf("%d\n",a[i]);

        //}


    }

    return 0;

}

