#include <stdio.h>

int main()
{
    int current_day,current_month,current_year;
    int day,month,year;

    printf("Please enter the current date:>\n");
    printf("Enter the current year:>");
    scanf("%d",&current_year);
    printf("Enter the currrent month:>");
    scanf("%d",&current_month);
    printf("Enter the current day:>");
    scanf("%d",&current_day);

    printf("\n\nNow Enter your date of Birth:>\n");
    printf("Enter the year:>");
    scanf("%d",&year);
    printf("Enter the month:>");
    scanf("%d",&month);
    printf("Enter the day:>");
    scanf("%d",&day);

    year=current_year-year;
    month=fabs(current_month-month);
    day=fabs(current_day-day);

    printf("\n\nYou are now\n%d Years\n%d months\n%d days\n",year,month,day);

    return 0;
}
