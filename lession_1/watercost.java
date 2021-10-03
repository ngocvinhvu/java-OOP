import java.util.Scanner;


class WaterCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Consumed water (m3) : ");
        int consume = input.nextInt();

        if (consume <= 10) {
            int cost = consume * 5973;
            int water_cost = cost * 105 / 100;
            System.out.println("Water cost: " + water_cost);
        } else if (10 < consume && consume <= 20) {
            int cost = (10 * 5973) + ((consume - 10) * 7052);
            int water_cost = cost * 105 / 100;
            System.out.println("Water cost: " + water_cost);
        } else if (20 < consume && consume <= 30) {
            int cost = (10 * 5973) + (20 * 7052) + ((consume - 20) * 8669);
            int water_cost = cost * 105 / 100;
            System.out.println("Water cost: " + water_cost);
        } else if (consume > 30) {
            int cost = (10 * 5973) + (20 * 7052) + (30 * 8669) + ((consume - 30) * 15929);
            int water_cost = cost * 105 / 100;
            System.out.println("Water cost: " + water_cost);
        } else {
            System.out.println("consumed water number is invalid");
        }
    }
}
