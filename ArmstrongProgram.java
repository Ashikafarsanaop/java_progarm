import java.util.Scanner;

class ArmstrongPrgrm {

    boolean check(int n) {
        int temp = n;
        int sum = 0;

        while (temp != 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        ArmstrongPrgrm obj = new ArmstrongPrgrm();

        if (obj.check(num))
            System.out.println("Armstrong number");
        else
            System.out.println("Not Armstrong number");
    }
}
