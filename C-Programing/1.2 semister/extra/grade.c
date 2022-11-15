#include <stdio.h>
int main()
{
    float a;
    printf("Enter your mark:\n");
    scanf("%f", &a);
    if(a>=80&&a<=100)
    {
        printf("Outstanding! You got A+");
    }
    else if(a>=75&&a<=79)
    {
        printf("Excellent! You got A.");
    }
    else if(a>=70&&a<=74)
    {
        printf("Very Good! You got A-");
    }
    else if(a>=65&&a<=69)
    {
        printf("Good! You got B+");
    }
    else if(a>=60&&a<=64)
    {
        printf("Above average! You got B");
    }
    else if(a>=55&&a<=59)
    {
        printf("Average! You got B-");
    }
        else if(a>=50&&a<=54)
    {
        printf("Below Average! You got C+");
    }
        else if(a>=45&&a<=49)
    {
        printf("Poor! You got C");
    }
        else if(a>=40&&a<=44)
    {
        printf("Pass! You got D");
    }
        else
    {
        printf("Sorry! You are not in the list!");
    }

    return 0;
}
