#include<stdio.h>
int main()
{
    int arr[100],arrB[100],n,root=1,item,index,i;
    for(int i=1; i<=100; i++)
    {
        arrB[i]=NULL;
    }
    printf("Enter the Element number:\n");
    scanf("%d",&n);
    for(int i=1; i<=n; i++)
    {
        scanf("%d",&arr[i]);
    }
    arrB[root]=arr[1];
    for(int i=2; i<=n; i++)
    {
        root=1;
        while(arrB[root]!=NULL)
        {
            if(arr[i]>arrB[root])
            {
                root=2*root+1;
            }
            else if(arr[i]<arrB[root])
            {
                root=2*root;
            }
        }
        if(arrB[root]==NULL)
        {
            arrB[root]=arr[i];
        }
        index=root;
    }
    printf("\nEnter the search item : ");
    scanf("%d",&item);
    i=1;
    while(i<=index)
    {
        if(item>arrB[i])
        {
            i=2*i+1;
        }
        else if(item<arrB[i])
        {
            i=2*i;
        }
        if(item==arrB[i])
        {
            printf("Found at :%d",i);
            break;
        }
    }
    if(i>index+1)
    {
        printf("NOT FOUND");
    }
    return 0;
}
