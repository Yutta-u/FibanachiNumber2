import java.util.Scanner;

public class FibanachiNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextInt();
        long a = 0;
        long b = 1;
        long c = 0;
        long d = 0;
        long i = 0;
        while (c < n) {
            a = b;
            b = c;
            c = a + b;
            d++;
            i++;
        }
        if (n == c) {
            System.out.println(1 + " " + i);
        } else {
            System.out.println(0);
        }
    }
}
