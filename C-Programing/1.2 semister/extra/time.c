 #include<stdio.h>
 int main()
 {
     float t;
     printf("Enter the Time:\n");
     scanf("%f", &t);
     if(t>0&&t<5)
     {
         printf("Its deep night!\n");
     }
     else if(t>4&&t<12)
     {
         printf("Good morning!");
     }
     else if(t>11&&t<14)
     {
         printf("Good Noon!");
     }
     else if(t>13&&t<18)
     {
         printf("Good Afternoon!");
     }
     else if(t>17&&t<=24)
     {
         printf("Good Night!");
     }
     else
     {
         printf("Sorry You Entered Wrong Time.");
     }

     return 0;
 }
