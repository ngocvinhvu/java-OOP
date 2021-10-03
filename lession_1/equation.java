import java.util.Scanner;


class Equation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Fill a: ");

        int a = input.nextInt();
    
        System.out.println("Fill b: ");
    
        int b = input.nextInt();

        System.out.println("Fill c: ");
    
        int c = input.nextInt();

        float delta = b * b - (4 * a * c);

        if (delta < 0) {
            System.out.println("The equation has no root");
        } else if (delta == 0) {
            float root = (-b) / (2 * a);
            System.out.println("The equation has double root: " + root);
        } else {
            double root1 = ((-b) + Math.sqrt(delta)) / (2 * a);
            double root2 = ((-b) - Math.sqrt(delta)) / (2 * a);
            System.out.println("The equation has 2 root: ");
            System.out.println("root1: " + root1);
            System.out.println("root1: " + root2);
        }
    }
}

