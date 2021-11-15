


public class Pattern10 {
    public static void main(String[] args) {
        for (int i = 10; i >= 1; i--) {
            for (int j = 1; j < i; j++)
                System.out.print("  ");
            for (int j = i; j <= 10; j++)
                System.out.print(j % 10 + " ");
            for (int j = 9; j >= i; j--)
                System.out.print(j+" ");
            System.out.println();
        }
    }
}