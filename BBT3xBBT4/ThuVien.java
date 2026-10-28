import java.util.Scanner;
class ThuVien {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;

    public void nhaptt(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tenSach = sc.nextLine();
        System.out.print("Nhap tac gia: ");
        tacGia = sc.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        namXuatBan = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        donGia = Double.parseDouble(sc.nextLine());
        System.out.print("Nhap so luong: ");
        soLuong = Integer.parseInt(sc.nextLine());
    }

    // Bài 1
    public void xuattt() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
    }
    // Bài 2
    public double thanhtien() {
        return donGia * soLuong;
    }

    // Bài 3
    public double phivanchuyen() {
        return thanhtien() * 0.05;
    }

    // Bài 4
    public double tongtiennhap() {
        return thanhtien() + phivanchuyen();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien tv = new ThuVien();
        tv.nhaptt(sc);
        tv.xuattt();
        System.out.println("Thanh tien: " + tv.thanhtien());
        System.out.println("Phi van chuyen: " + tv.phivanchuyen());
        System.out.println("Tong tien nhap: " + tv.tongtiennhap());
    }
}