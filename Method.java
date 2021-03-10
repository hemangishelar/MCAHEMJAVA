public class Method { // class
    // we cannot access anything inside a class without a object
    public static void fun() {
        System.out.println("Hi i am Function.");

    }

    public void cheaters() {// no arguments & void returntype
        String Cheater1 = "Deepmita";
        String Cheater2 = "Sachin";
        String Cheater3 = "Kadam";
        System.out.println("Chaeter's are:-" + Cheater1 + " " + Cheater2 + " " + Cheater3);
    }

    /*
     * types of function 1) takes nothing & returns nothing(with void returntype &
     * no arguments) 2) takes something returns nothing(taking parameters void
     * returntype) 3)takes nothing returns something(no argument & returntype is not
     * void) 4)takes something returns something
     */
    public void number(int a) {// taking parameter & returning nothing
        a++;// 11
        System.out.println("Function type is :-Takes Something & returns nothing" + a);// 6
    }

    public int sum() {// takes nothing returns integer
        int a, b;
        a = 2;
        b = 3;
        return a + b;
    }

    public char alphabet(char z) {
        return z;
    }

    public static void main(String[] args) { // method
        // function:- piece of code which is called when we need it.
        // function definition
        // function call
        /*
         * syntax:- returntype function_name(pass arguments){ block of code }
         * function_name();
         */
        Method o1 = new Method();// ignore this
        fun();
        o1.cheaters();
        o1.cheaters();
        o1.cheaters();
        o1.number(10);
        int result = o1.sum();
        System.out.println("Function type is takes nothing returns something" + result);
        char store = o1.alphabet('a');
        System.out.println(store);

    }
}