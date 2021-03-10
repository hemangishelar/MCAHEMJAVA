public class array {
    public static void main(String[] args) {
        // array:-collection of homogenous data
        // types:-single & multidimension

        // Disadvant:-Limited size

        // datatype arrayname [size]
        // datatype[] arrayname
        int a[] = new int[5];
        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 104;
        a[4] = 105;

        for (int i = 0; i < a.length; i++) { //
            System.out.println(a[i]);
        }

    }

}
