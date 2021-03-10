package OOps;

public class Inheritanceexample {
    public static void main(String[] args) {

        child o1 = new child();
        o1.sum();
        o1.multiply();
    }

}

class baseclass {
    int a, b, c;// global variables

    public void sum() {
        a = 2;
        b = 3;
        c = a + b;
        System.out.println("Sum=" + c);
    }
}

class child extends baseclass {

    public void multiply() {
        c = a * b;
        System.out.println("Result=" + c);
    }
}