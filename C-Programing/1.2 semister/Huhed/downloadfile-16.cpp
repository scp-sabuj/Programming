#include<stdio.h>
#include<string.h>
#include<algorithm>

struct st{
    char ch;
    int cnt;
};

int compare(const void *var1, const void *var2)
{
    st *a = (st *)var1;
    st *b = (st *)var2;
    if(a->cnt < b->cnt) return -1;
    else if(a->cnt == b->cnt)
    {
        if(a->ch > b->ch) return -1;
    }
}

int main()
{

    char arr[1250], distinct[1250];
    bool flag[150];
    int numOfDistinct, lengthStrArr;
    st strArr[1250], locStr;

    while(gets(arr))
    {
        numOfDistinct = 0;
        lengthStrArr = 0;
        memset(flag,false,sizeof(flag));
        for(int i=0;i<strlen(arr);i++)
        {
            if(flag[arr[i]] == false)
            {
                distinct[numOfDistinct] = arr[i];
                numOfDistinct++;
                flag[arr[i]] = true;
            }
        }
        for(int i=0;i<numOfDistinct;i++)
        {
            int cnt = 0;
            for(int j=0;j<strlen(arr);j++)
            {
                if(distinct[i] == arr[j])
                {
                    cnt++;
                }
            }

            strArr[lengthStrArr].ch = distinct[i];
            strArr[lengthStrArr].cnt = cnt;
            lengthStrArr++;

        }

        qsort(strArr, numOfDistinct, sizeof(st), compare);
        for(int i=0;i<numOfDistinct;i++)
            printf("%d %d\n",strArr[i].ch,strArr[i].cnt);
    }

}
