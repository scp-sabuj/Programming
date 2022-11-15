#include<iostream>
#include<stdlib.h>
using namespace std;

typedef struct node{
    int info;
    node *left;
    node *right;
};

void SearchItem(node *trav, int item)
{
    while(trav != NULL)
    {
        if(item == trav->info)
        {
            cout<<"Found"<<endl;
            return;
        }
        else if(item > trav->info)
        {
            trav = trav->right;
        }
        else
        {
            trav = trav->left;
        }
    }

    cout<<"Not Found"<<endl;
    return;
}

int main()
{
    node *root, *newNode;
    int n,m, item, check;
    root = NULL;
    while(cin>>check)
    {

        if(check == 1)
        {
            cin>>m;
            if(root == NULL)
            {
                root = (node *)malloc(sizeof(node));
                root->info = m;
                root->left = NULL;
                root->right = NULL;
            }
            else
            {
                node *trav;
                trav = root;
                while(trav != NULL)
                {
                    if(m > trav->info)
                    {
                        if(trav->right == NULL)
                        {
                            newNode = (node *)malloc(sizeof(node));
                            newNode->info = m;
                            newNode->left = NULL;
                            newNode->right = NULL;
                            trav->right = newNode;
                            break;
                        }
                        else trav = trav->right;
                    }
                    else
                    {
                        if(trav->left == NULL)
                        {
                            newNode = (node *)malloc(sizeof(node));
                            newNode->info = m;
                            newNode->left = NULL;
                            newNode->right = NULL;
                            trav->left = newNode;
                            break;
                        }
                        else trav = trav->left;
                    }
                }

            }
        }
        else
        {
            cin>>item;
            SearchItem(root,item);
        }

    }


}

