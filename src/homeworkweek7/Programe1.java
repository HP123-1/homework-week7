package homeworkweek7;
/**Write a java program that tells us that Input number is odd or even?
 HINT: use ternary operator (? :)**/






import com.sun.org.apache.xpath.internal.objects.XNumber;

import java.util.Scanner;

public class Programe1 {

    public static void main(String[] args) {

        Scanner test = new Scanner(System.in);

        System.out.println("Entre a number : ");
        int num = test.nextInt();

        test.close();

        // ternery operator to check

        String result = num % 2 == 0 ? "even" : "Odd";

        //  if(num %2==0 ){
        System.out.println( num  +  "is" +  result );
        //  }else
        //   System.out.println(num + " is odd");
    }

}
