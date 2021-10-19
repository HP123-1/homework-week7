package homeworkweek7;

import java.util.Scanner;

public class Pro11Divide {
    /*
Write a java program to print the numbers between 1 to 100 which can be divided by 3
and 5 separately
 */


    public void Pro11Divide() {
        System.out.println("Divided by 3:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ",");

        }
        System.out.println("Divided by 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 5 == 0)
                System.out.print(i + ",");

        }
        System.out.println("Divided by 3 & 5:");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.print(i + ",");
        }
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pro11Divide obj = new Pro11Divide();
        obj.Pro11Divide();

    }
}












