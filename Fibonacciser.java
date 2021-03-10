//WAP in java to take input from user for age, designation, name, salary.
If age>=25 then print Fibonacci series from 0 to age. If salary>=10000 then calculate the factorial of age . if the designation entered is “professor” then it should print “welcome to ADYPU“.
import java.util.Scanner;

public class Fibonacciser {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Age");
        int age = sc.nextInt();

        System.out.println("Enter designation");
        String desg = sc.next();

        System.out.println("Enter Name");
        String name = sc.next();
        System.out.println("Enter salary");
        int sal = sc.nextInt();

        if (age >= 25) {

            int a = 1;
            int b = 0;
            int c = 0;

            while (true) {

                c = a + b;
                if (age <= c) {
                    break;
                }
                System.out.println(c);

                a = b;
                b = c;
            }
            System.out.println("---------------");
        }
        if (sal >= 10000) {
            int n = age;
            System.out.println(n);

            int f = 1;

            while (n > 0) {
                f = f * n;
                n--;
            }

            System.out.println(age + " Factotorial  :" + f);
        }

        if (desg.equals("professor")) {

            System.out.println("Welcome to Adypu");
        }

    }
}