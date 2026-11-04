//Baitaptuan5
import java.util.Scanner;
public class ThuVien {
    private String masach;
    private String tensach;
    private int soluong, n;
    private double dongia;
    private ThuVien[] dssach;

    public void Nhaptt(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        masach = sc.nextLine();
        System.out.print("Nhap ten sach: ");
        tensach = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soluong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhap don gia: ");
        dongia = Double.parseDouble(sc.nextLine());
    }

    public void xuattt() {
        System.out.println("Ma sach: " + masach);
        System.out.println("Ten sach: " + tensach);
        System.out.println("So luong: " + soluong);
        System.out.println("Don gia: " + dongia);
    }

    // Bai 1: Nhap n sach bang vong lap
    public void nhapdanhsach(Scanner sc) {
        do {
            System.out.print("Nhap so luong sach: ");
            n = Integer.parseInt(sc.nextLine());
            if (n <= 0) {
                System.out.println("So luong sach khong hop le");
            }
        }
        while (n <= 0);
        dssach = new ThuVien[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Nhap thong tin sach thu " + (i + 1) + ":");
            dssach[i] = new ThuVien();
            dssach[i].Nhaptt(sc);
        }
    }
    //Bài 2: Tính tổng số lượng và tổng giá trị sách
    public void tinhtong() {
        if (dssach == null) {
            System.out.println("Nhap danh sach truoc.");
            return;
        }
        int tongSoLuong = 0;
        int i = 0;
        double tongGiaTri = 0;
        do {
            tongSoLuong += dssach[i].soluong;
            tongGiaTri += dssach[i].soluong * dssach[i].dongia;
            i++;
        }
        while (i < n);
        System.out.println("Tong so luong sach: " + tongSoLuong);
        System.out.println("Tong gia tri sach: " + tongGiaTri);
    }
    // Bai 4: Tim sach theo ma
    public void timSachTheoMa(Scanner sc) {
        String maCanTim;
        int i;
        if (dssach == null) {
            System.out.println("Nhap danh sach truoc");
            return;
        }
        System.out.print("Nhap ma sach can tim: ");
        maCanTim = sc.nextLine();
        i = 0;
        boolean timThay = false;
        do {
            if (dssach[i].masach.equalsIgnoreCase(maCanTim)) {
                System.out.println("Tim thay sach:");
                dssach[i].xuattt();
                timThay = true;
                break;
            }
            i++;
        } while (i < n);
        if (!timThay) {
            System.out.println("Khong tim thay");
        }
    }

    // Bai 3: Menu lap den khi chon Thoat
    public void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("Menu");
            System.out.println("1. Nhap danh sach sach");
            System.out.println("2. Tinh tong so luong va tong gia tri sach");
            System.out.println("3. Tim sach theo ma");
            System.out.println("4. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = Integer.parseInt(sc.nextLine());
            switch (chon) {
                case 1:
                    nhapdanhsach(sc);
                    break;
                case 2:
                    tinhtong();
                    break;
                case 3:
                    timSachTheoMa(sc);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (chon != 4);
    }
    public static void main(String[] args) {
        ThuVien tv = new ThuVien();
        tv.menu();
    }
}