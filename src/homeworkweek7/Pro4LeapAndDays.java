

package homeworkweek7;

//4. Number of Days In Month
//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is,
//otherwise return false.
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisible by 400.







import java.util.Scanner;

public class Pro4LeapAndDays {
    static int year;
    static int month;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter any year");
        year = input.nextInt();
        System.out.println("enter  month");
        month= input.nextInt();
        getDaysInMonth(month, year);
        isLeapYear(year);
        input.close();
    }


    public static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }


    }

    public static void getDaysInMonth(int month, int year) {


        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            System.out.println("-1");
            // return -1;
        }
        switch (month) {
            case 1:
                System.out.println("31");
                break;
            case 2:
                if (Pro4LeapAndDays.isLeapYear(year)) {
                    System.out.println("29");
                } else
                    System.out.println("28");
                break;
            case 3:
                System.out.println("31");
                break;
            case 4:
                System.out.println("30");
                break;
            case 5:
                System.out.println("31");
                break;
            case 6:
                System.out.println("30");
                break;
            case 7:
                System.out.println("31");
                break;
            case 8:
                System.out.println("31");
                break;
            case 9:
                System.out.println("30");
                break;
            case 10:
                System.out.println("31");
                break;
            case 11:
                System.out.println("30");
                break;
            case 12:
                System.out.println("31");
                break;
        }

        // System.out.println("1");
        // return 0;

    }


}