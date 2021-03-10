package OOps;

public class inheritance {
    // inheritance is simply a process in which ur child class will access the
    // features of base class.
    public static void main(String[] args) {
        childclass o1 = new childclass();
        o1.fun();
        o1.fun2();

    }

}

class parentclass {
    public void fun() {
        System.out.println("I am in base class");

    }

}

class childclass extends parentclass {
    public void fun2() {
        System.out.println("I am in child class");
    }
}
