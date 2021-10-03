package lession_2;


import java.util.Scanner;


public class Point {
    private String name;
    private int x;
    private int y;

    // get, set
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    // Constructor
    public Point() {
        this.name = "A";
        this.x = 0;
        this.y = 0;
    }

    public Point(int a, int b) {
        this.x = a;
        this.y = b;
    }

    public Point(String s, int a, int b) {
        this.name = s;
        this.x = a;
        this.y = b;
    }

    // Fill in 1 point from keyboard
    public String FillInPoint() {
        String s;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao x: ");
        int a = input.nextInt();
        System.out.println("Nhap vao y: ");
        int b = input.nextInt();
        this.x = a;
        this.y = b;
        s = System.out.println("A" + "(" + this.x + "," + this.y + ")");
        return s;
    }
}
