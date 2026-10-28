//Version bt 4
import java.util.Scanner;
class ThuVien {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private int namXuatBan;
    private double donGia;
    private int soLuong;
    private int loaisach;

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
        System.out.print("Nhap loai sach (1. Sách giáo khoa 2. Sách tham khảo 3. Sách chuyên ngành 4. Sách khác) : ");
        loaisach = Integer.parseInt(sc.nextLine());
    }
    //Bài 1
    public boolean kiemtra(){
        boolean ktra = true;
        if (donGia <= 0) {
            System.out.println("Don gia khong hop le");
            ktra = false;
        }
        else {
            System.out.println("Don gia hop le");

        }
        if (soLuong <0) {
            System.out.println("So luong khong hop le");
            ktra = false;
        }
        else {
            System.out.println("So luong hop le");
        }
        if (namXuatBan <=2026 && namXuatBan >0){
            System.out.println("Nam xuat ban hop le");

        }
        else {
            System.out.println("Nam xuat ban khong hop le");
            ktra = false;
        }
        return ktra;
    }
// Bài 2
    public void phanloaigia() {
        if (donGia < 50000) {
            System.out.println("Sach gia thap");
        } else if (donGia < 100000) {
            System.out.println("Sach gia trung binh");
        } else if (donGia <= 200000) {
            System.out.println("Sach gia cao");
        } else {
            System.out.println("Sach gia dac biet");
        }
    }
// Bài 3
    public void phanloaitonkho() {
        if (soLuong == 0){
            System.out.println("Het sach");
        }
        else if (soLuong <= 5){
            System.out.println("Sap het");
        }
        else if (soLuong <=20){
            System.out.println("Con it");
        }
        else {
            System.out.println("Con nhieu");
        }
    }

// Bài 4
    public void phanloaisach(){
        switch(loaisach){
            case 1:
                System.out.println("Sach giao khoa");
                break;
            case 2:
                System.out.println("Sach tham khao");
                break;
            case 3:
                System.out.println("Sach chuyen nganh");
                break;
            case 4:
                System.out.println("Sach khac");
                break;
            default:
                System.out.println("Loai sach khong hop le");
        }

    }
    public void xuattt() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Ten sach: " + tenSach);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("Don gia: " + donGia);
        System.out.println("So luong: " + soLuong);
    }
    public double thanhtien() {
        return donGia * soLuong;
    }

    public double phivanchuyen() {
        return thanhtien() * 0.05;
    }

    public double tongtiennhap() {
        return thanhtien() + phivanchuyen();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien tv = new ThuVien();
        tv.nhaptt(sc);
        tv.xuattt();
        if (tv.kiemtra()){
            tv.phanloaigia();
            tv.phanloaitonkho();
            tv.phanloaisach();
        System.out.println("Thanh tien: " + tv.thanhtien());
        System.out.println("Phi van chuyen: " + tv.phivanchuyen());
        System.out.println("Tong tien nhap: " + tv.tongtiennhap());
        }
        else {
            System.out.println("Sach khong hop le");
        }
    }
}