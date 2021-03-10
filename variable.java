/*
 * variable:- container used to store data var=5 Syntax:- to define a variable;
 * 
 * datatype variablename = value
 * 
 */
public class variable {
    public static void main(String[] args) {
        // declare variable
        int var = 5; // statically typed
        System.out.println("Var=" + var);

        /*
         * algo 1)start Define 3 variables say a,b,c resp.; 2) assign values to a &b
         * 3)store sum of a&b in c 4) print value of c 5)end
         */
        int a, b, c;
        a = 4;
        b = 5;
        c = a + b;
        System.out.println("Sum=" + c);

    }
}