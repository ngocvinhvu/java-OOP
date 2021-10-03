
package com.baitap03;

import java.util.Objects;

public class NhanVien {
    private String tenNhanVien;
    private double luongCoBan;
    private double heSoLuong;
    
    //Constructor
    public NhanVien(String t, double l, double h){
        this.tenNhanVien = t;
        this.setLuongCoBan(l);
        this.setHeSoLuong(h);
    }
    
    public NhanVien(String t){
        this.tenNhanVien = t;
    }
    
    public NhanVien(){
        this.tenNhanVien = "Ng. Van A";
        this.luongCoBan = 1350000;
        this.heSoLuong = 2.34;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NhanVien other = (NhanVien) obj;
        if (Double.doubleToLongBits(this.luongCoBan) != Double.doubleToLongBits(other.luongCoBan)) {
            return false;
        }
        if (Double.doubleToLongBits(this.heSoLuong) != Double.doubleToLongBits(other.heSoLuong)) {
            return false;
        }
        if (!Objects.equals(this.tenNhanVien, other.tenNhanVien)) {
            return false;
        }
        return true;
    }
    
    
    
    
    //Khai bao hang su dung tu khoa final
    public final double LUONG_MAX = 10000000;

    public String getTenNhanVien() {
        return tenNhanVien;
    }

    public void setTenNhanVien(String tenNhanVien) {
        this.tenNhanVien = tenNhanVien;
    }

    public double getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(double luongCoBan) {
        if(luongCoBan > 0)
            this.luongCoBan = luongCoBan;
    }

    public double getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(double heSoLuong) {
        if(heSoLuong > 0)
            this.heSoLuong = heSoLuong;
    }
    
    public void inTTin(){
        System.out.println("Thong tin nhan vien:");
        System.out.println("Ten nhan vien: " + this.tenNhanVien);
        System.out.println("Luong nhan vien: " + this.tinhLuong());
    }
    
    public double tinhLuong(){
        return this.luongCoBan * this.heSoLuong;
    }
    
    public boolean tangLuong(double heSoTangThem){
        if(heSoTangThem <= 0) return false;
        
        if((this.heSoLuong + heSoTangThem)*this.luongCoBan >
                this.LUONG_MAX) {
            System.out.println("Tang luong khong thanh cong");
            return false;
        } else {
            this.heSoLuong += heSoTangThem;
            System.out.println("Da tang luong thanh cong");
            return true;
        }
    }
    
    
}
