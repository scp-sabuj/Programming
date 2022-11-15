#include <stdio.h>
int main()
{
    int heap[100],size,i,j,c,root,temp;
    printf( "Enter the size of array:");
    scanf("%d", &size);
    printf("Enter the elements :\n");
    for (i=0; i<size; i++)
    {
        scanf("%d",&heap[i]);
    }
    for (i=1; i<size; i++)
    {
        c=i;
        while(c!=0)
        {
            root=(c-1)/2;
            if(heap[root]<heap[c])
            {
                temp=heap[root];
                heap[root]=heap[c];
                heap[c]=temp;
            }
            c=root;
        }
    }
    for (j=size-1; j>=0; j--)
    {
        temp=heap[0];
        heap[0]=heap[j];
        heap[j]=temp;
        root=0;
        do
        {
            c=2*root+1;
            if((heap[c]<heap[c+1])&&c<j-1)
            {
                c++;
            }

        if (heap[root]<heap[c]&&c<j)
            {
                temp=heap[root];
                heap[root]=heap[c];
                heap[c]=temp;
            }
            root=c;
        }
        while(c<j);
    }
    printf("\n\nThe sorted array is : \n\n ");
    for(i=0; i<size; i++)
    {
        printf(" %d, ",heap[i]);
    }
    return 0;
}

