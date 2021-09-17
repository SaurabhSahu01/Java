/*
taking user input for month and year and printing the calender
method1 : taking user input 
method2 : printing month calender 
method3 : monthName();
method4 : first day
method5 : number of days in a month
start day of jan 1, 1800 = wednesday (day = 3)

This calender will work for years 2000 onwards
*/ 

import java.util.Scanner;
public class MonthCalender {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month and year (1 for january followed by the year) : ");
        int month = input.nextInt();
        int year = input.nextInt();
        input.close(); // closing the Scanner object 

        printMonth(month,year); // this will print the calender 
    }

    public static void printMonth(int month, int year){
        System.out.println("                        " + monthName(month) + ", " + year);
        System.out.println("---------------------------------------------------------------");
        System.out.println("Sun    Mon    Tue    Wed    Thu    Fri    Sat\n");
        for(int i=0;i<firstDayOFMonth(month, year);i++){
            System.out.print("       ");
        }
        for(int i=1;i<=numberOfDays(month, year);i++){
            if((i+firstDayOFMonth(month, year))%7==0){
                System.out.printf(" %-6d\n\n",i);
            }
            else{
                System.out.printf(" %-6d",i);
            }
        }
        
    }
    public static String monthName(int month){
        String monthname = "";
        switch(month){
            case 1 : monthname = "January"; break;
            case 2 : monthname = "February"; break;
            case 3 : monthname = "March"; break;
            case 4 : monthname = "April"; break;
            case 5 : monthname = "May"; break;
            case 6 : monthname = "June"; break;
            case 7 : monthname = "July"; break;
            case 8 : monthname = "August"; break;
            case 9 : monthname = "September"; break;
            case 10 : monthname = "October"; break;
            case 11 : monthname = "November"; break;
            case 12 : monthname = "December"; 
        }

        return monthname;
    }
    public static int numberOfDays(int month, int year){
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            return 31;
        }
        else if(month == 2){
            return (isLeapYear(year) ? 29 : 28);
        }
        else
            return 30;
    }

    public static boolean isLeapYear(int year){
        if(year % 4 == 0){
            return true;
        }
        else 
            return false;
    }

    public static int firstDayOFMonth(int month, int year){
        int total_days = 0;
        final int FIRST_DAY_JAN1_2000 = 6;

        for(int i = 2000;i<year;i++){
            if(isLeapYear(i))
                total_days += 366;
            else
                total_days += 365;
        }
       
        for(int i=1;i<month;i++){
            total_days += numberOfDays(i , year);
        }
        total_days += FIRST_DAY_JAN1_2000;
        return (total_days%7);
    }
    
}