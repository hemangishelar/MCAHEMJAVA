public class Simple1 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >= 1; i--) // row 54321 **** **** *** ** *
        {
            for (int j = 1; j <= i; j++) // col- 1,2,3,4,5 i-5,4,3,2,1
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}