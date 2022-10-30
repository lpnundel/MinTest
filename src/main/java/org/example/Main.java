package org.example;

public class Main {

    public static void main(String[] args) {

    }


    public static boolean isLeapYear(int year){


       if(year % 4 == 0)
       {
           if(year % 100 == 0)
           {

               if(year % 400 == 0)
               {
                   //System.out.println(year + " is a leap year");
                   return true;
               }
               else{
                   //System.out.println(year + " is not a leap year");
                   return false;
               }
           }
           else{
               //System.out.println(year + " is a leap year");
               return true;
           }

       }
       else{
           //System.out.println(year + " is not a leap year");
           return false;
       }


    }


}