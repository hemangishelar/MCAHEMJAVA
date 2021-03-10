package OOps;

public class MethodOverriding {
    /*
     * override a method? same method name in different classes if child & parent
     * has has a method with same name is termed as method overrriding ;Same name &
     * same Parameters
     * 
     * 
     * 
     */
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.info();

    }

}

class New {

    public void info() {
        System.out.println("new creativity");

    }
}

class Employee extends New {
    public void info() {
        String name = "hemangi ashok shelar";
        int age = 22;
        double salary = 200000.00;
        System.out.println("Age=" + age);
        System.out.println("Name=" + name);
        System.out.println("Salary=" + salary);

    }

}
