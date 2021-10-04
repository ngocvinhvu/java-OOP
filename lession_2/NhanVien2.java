package lession_2;


public class NhanVien2 {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public final double LUONG_MAX;

    public void inTTin() {
        System.out.println(this.tenNhanVien);
        System.out.println(this.luongCoBan);
        System.out.println(this.heSoLuong);
        System.out.println(this.LUONG_MAX);
    }

    // Constructor
    public NhanVien2(String t, double l, double h) {
        this.tenNhanVien = t;
        this.luongCoBan = l;
        this.heSoLuong = h;
    }

    public NhanVien2(String t) {
        this.tenNhanVien = t;
    }

    public NhanVien2() {
        this.tenNhanVien = "Nguyen Van A";
        this.luongCoBan = 1350000;
        this.heSoLuong = 2.34;
    }

    public boolean tangLuong(int heSoLuong) {
        if (heSoLuong <= 0) {
            System.out.println("He so luong phai lon hon 0");
            return false;
        } else if (this.luongCoBan * heSoLuong > this.LUONG_MAX) {
            System.out.println("Luong phai nho hon Luong Max");
            return false;
        } else {
            return true;
        }
    }

    public void setName(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public String getName() {
        return tenNhanVien;
    }

    public void setluongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public double getluongCoBan() {
        return luongCoBan;
    }

    public void setheSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public double getheSoLuong() {
        return heSoLuong;
    }
}