package OOps;

public class Casting {
    public static void main(String[] args) {
        // way of converting one datatype to another.
        /*
         * 1)Implicit & Explicit 2) Widdening & Narrowing widdening:-small type to large
         * type Narrowing:-large type to small type
         */
        int num1 = 33;
        double numtodouble = num1;
        System.out.println("int to double=" + numtodouble);// widdening

        int num2 = (int) numtodouble;
        System.out.println("Double to int=" + num2);// Narrowing

        float var = 45;
        System.out.println("Float value=" + var);

        int var2 = (int) var;
        System.out.println("Narrowing:-Float to int=" + var2);

    }

}