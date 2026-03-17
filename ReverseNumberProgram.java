import java.util.Scanner;

class ReverseNumberPrgrm {

    int reverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + n % 10;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        ReverseNumberPrgrm obj = new ReverseNumberPrgrm();
        System.out.println("Reversed number = " + obj.reverse(num));
    }
}
