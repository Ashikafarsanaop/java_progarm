import java.util.Scanner;

class RectangleSquarePrgram {

    void calculate(int side, int breadth) {
        int squareArea = side * side;
        int length = squareArea / breadth;
        int perimeter = 2 * (length + breadth);

        System.out.println("Length of rectangle = " + length);
        System.out.println("Area of rectangle = " + squareArea);
        System.out.println("Perimeter of rectangle = " + perimeter);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

 RectangleSquarePrgram obj = new  RectangleSquarePrgram();
        obj.calculate(side, breadth);
    }
}
