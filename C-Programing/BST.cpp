#include<stdio.h>
int main()
{
    int arr[100],n,element,i,root=1,item,comp,arrB[1000],ind,pos;
    while(true)
    {
        printf("Enter the size of array");
        scanf("%d",&n);
        for(i=1; i<=n; i++)
        {
            scanf("%d",&arr[i]);
        }
        for(i=1; i<=100; i++)
        {
            arrB[i]=NULL;
        }
        arrB[1]=arr[1];
        printf("\n\n%d item index : %d\n",arr[i],1);
        for(int j=2; j<=n; j++)
        {

            while(arrB[root]!=NULL)
            {
                if(arr[j]<arrB[root])
                {
                    root=root*2;
                }
                else
                {
                    root=root*2+1;
                }
            }
            if(arrB[root]==NULL)
            {
                arrB[root]=arr[j];
                printf("%d item index : %d\n",arr[j],root);
                ind=root;
            }
            root=1;
        }
        printf("\n\nEnter the search item : ");
        scanf("%d",&item);
        printf("\n\n");
        while(root<=ind)
        {
            if(arrB[root]==item)
            {
                printf("found at Position : %d",root);
                break;
            }
            else if(item<arrB[root])
            {
                root=root*2;
            }
            else
            {
                root=root*2+1;
            }

        }
        if(root>ind)
        {
            printf("Not found");
        }
        printf("\n\n\n\n\n");
    }
    return 0;
}
