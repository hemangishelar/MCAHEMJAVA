package OOps;

public class Multipleinheritance {
    
    public static void main(String[] args) {
        uses obj = new uses();
        obj.add();
        obj.div();// method call

    }
    
}
class uses implements suming, divigen {
    public void add() {// method definition
        int a, b, c;
        a = 51;
        b = 21;
        c = a + b;
        System.out.println("SUm= " + c);
    }

    public void div() {
        int a, b, c;
        a = 23450;
        b = 2;
        c = a / b;
        System.out.println("Division result= " + c);
    }

}

interface suming {
    void add();// declaring function // Abstract method
}

interface divigen {
    void div();// declaring function
}