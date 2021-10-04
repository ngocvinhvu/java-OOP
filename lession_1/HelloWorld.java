package lession_1;
import lession_2.NhanVien;


public class HelloWorld {
    public static void main(String args[]) {
        NhanVien nv1 = new NhanVien();
        NhanVien nv2 = new NhanVien("Pham Thi B", 4000000, 1.6);

        // nv1.heSoLuong = 3.99; // Sai do private

        nv1.inTTin();
        nv1.setHeSoLuong(3.99);
        nv1.inTTin();
    }
}
