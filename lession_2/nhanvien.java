package lession_2;


public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    public final double LUONG_MAX;

    public String inTTin() {
        System.out.println(this.tenNhanVien);
        System.out.println(this.luongCoBan);
        System.out.println(this.heSoLuong);
        System.out.println(this.LUONG_MAX);
    }

    // Constructor
    public NhanVien(String t, double l, double h) {
        this.tenNhanVien = t;
        this.luongCoBan = l;
        this.heSoLuong = h;
    }

    public NhanVien(String t) {
        this.tenNhanVien = t;
    }

    public NhanVien() {
        this.tenNhanVien = "Nguyen Van A";
        this.luongCoBan = 1350000;
        this.heSoLuong = 2.34;
    }

    public boolean tangLuong(heSoLuong) {
        if (heSoLuong =< 0) {
            System.out.println("He so luong phai lon hon 0");
            return False
        } else if (this.luongCoBan * heSoLuong > this.LUONG_MAX) {
            System.out.println("Luong phai nho hon Luong Max");
            return False
        } else {
            return True
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
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

    public String getheSoLuong() {
        return heSoLuong;
    }

    public void setLUONG_MAX(double LUONG_MAX) {
        this.LUONG_MAX = LUONG_MAX;
    }

    public String getLUONG_MAX() {
        return LUONG_MAX;
    }
}