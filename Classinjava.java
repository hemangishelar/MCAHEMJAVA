package OOps;

public class Classinjava {
    /*
     * oops is a way of proramming;1) Encapsulation 2)Inheritance 3)Polymorphism
     * 4)Abstraction:-hiding Complexity; 5)Class & 6)object
     */
    String name = "hemangi";// Data member

    public void fun(String live) {// member function
        System.out.println(live);

    }

    public static void main(String[] args) {
        /*
         * Class:-Data member:- Variable Memberfunction:-Method/Function to acces the
         * class we have to create object of class. Classname ObjectName = new
         * ClassConstructor()
         * 
         */
        Classinjava o1 = new Classinjava();// object creation
        System.out.println(o1.name);
        o1.fun("Lives In malegaon");

    }

}
