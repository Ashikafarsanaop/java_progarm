import java.util.Scanner;

class SumDigitsprgrm {

    int sum(int n) {
        int s = 0;

        while (n != 0) {
            s += n % 10;
            n /= 10;
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        SumDigitsprgrm obj = new SumDigitsprgrm();
        System.out.println("Sum of digits = " + obj.sum(num));
    }
}
