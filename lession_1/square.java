import java.util.Scanner;


class SquareRectangular {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Fill in length: ");
        int length = input.nextInt();
        System.out.println("Fill in width: ");
        int width = input.nextInt();
        int square = length * width;
        System.out.println("Square of rectancular is: " + square);
    }
}

