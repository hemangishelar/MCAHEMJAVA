package OOps;

public class Multilevelinheritance {
    public static void main(String[] args) {
        division o1 = new division();
        o1.add();// sums
        o1.mul();// mult
        o1.div();// division

    }

}

class sums {
    int a, b, c;

    public void add() {
        a = 80;
        b = 20;
        c = a + b;
        System.out.println("Sum Result=" + c);
    }
}

class mult extends sums {
    int i, j, k;

    public void mul() {
        i = 8;
        j = 2;
        c = a * b;
        System.out.println("Multiply Result=" + c);
    }
}

class division extends mult {

    public void div() {
        k = i / j;
        System.out.println("Division Result=" + k);
    }
    
}
