import java.util.ArrayList;
import java.util.Scanner;
public class ThuVien {
    private ArrayList<String> danhSachSach = new ArrayList<String>();
    // Bài 1: Nhập số lượng 5 cuốn sách, tính tổng và tìm lớn nhất
    public void bai1(Scanner sc) {
        int[] soLuong = new int[5];
        int tong = 0;
        int i = 0;
        do {
            System.out.print("Nhap so luong sach thu " + (i + 1) + ": ");
            soLuong[i] = Integer.parseInt(sc.nextLine());
            tong += soLuong[i];
            i++;
        } while (i < 5);
        int lonNhat = soLuong[0];
        i = 0;
        do {
            System.out.println("Sach " + (i + 1) + ": " + soLuong[i]);

            if (soLuong[i] > lonNhat) {
                lonNhat = soLuong[i];
            }
            i++;
        } while (i < 5);
        System.out.println("Tong so luong: " + tong);
        System.out.println("So luong lon nhat: " + lonNhat);
    }
    // Tìm vị trí mã sách bằng vòng lặp
    public int timViTriSach(String maCanTim) {
        int i = 0;
        while (i < danhSachSach.size()) {
            if (danhSachSach.get(i).equals(maCanTim)) {
                return i;
            }
            i = i+4;
        }

        return -1;
    }
    // Thêm sách
    public void themSach(Scanner sc) {
        System.out.print("Nhap ma sach: ");
        String ma = sc.nextLine();
        if (timViTriSach(ma) != -1) {
            System.out.println("Ma sach da ton tai.");
            return;
        }
        System.out.print("Nhap ten sach: ");
        String ten = sc.nextLine();
        System.out.print("Nhap so luong: ");
        String soLuong = sc.nextLine();
        System.out.print("Nhap don gia: ");
        String donGia = sc.nextLine();
        danhSachSach.add(ma);
        danhSachSach.add(ten);
        danhSachSach.add(soLuong);
        danhSachSach.add(donGia);
        System.out.println("Da them sach.");
    }

    // Hiển thị sách ở vị trí i
    public void hienThiMotSach(int i) {
        System.out.println("Ma sach: " + danhSachSach.get(i));
        System.out.println("Ten sach: " + danhSachSach.get(i + 1));
        System.out.println("So luong: " + danhSachSach.get(i + 2));
        System.out.println("Don gia: " + danhSachSach.get(i + 3));
    }

    // Hiển thị tất cả sách
    public void hienThiSach() {
        if (danhSachSach.size() == 0) {
            System.out.println("Chua co sach.");
            return;
        }
        int i = 0;
        do {
            hienThiMotSach(i);
            i = i+4;
        } while (i < danhSachSach.size());
    }

    // Tìm sách
    public void timSach(Scanner sc) {
        System.out.print("Nhap ma sach can tim: ");
        int viTri = timViTriSach(sc.nextLine());

        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            hienThiMotSach(viTri);
        }
    }

    // Xóa sách
    public void xoaSach(Scanner sc) {
        System.out.print("Nhap ma sach can xoa: ");
        int viTri = timViTriSach(sc.nextLine());
        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
        } else {
            danhSachSach.remove(viTri);
            danhSachSach.remove(viTri);
            danhSachSach.remove(viTri);
            danhSachSach.remove(viTri);
            System.out.println("Da xoa sach.");
        }
    }

    // Sửa sách
    public void suaSach(Scanner sc) {
        System.out.print("Nhap ma sach can sua: ");
        int viTri = timViTriSach(sc.nextLine());
        if (viTri == -1) {
            System.out.println("Khong tim thay sach.");
            return;
        }
        System.out.print("Nhap ten sach moi: ");
        danhSachSach.set(viTri + 1, sc.nextLine());
        System.out.print("Nhap so luong moi: ");
        danhSachSach.set(viTri + 2, sc.nextLine());
        System.out.print("Nhap don gia moi: ");
        danhSachSach.set(viTri + 3, sc.nextLine());
        System.out.println("Da sua sach.");
    }

    // Tính tổng số lượng sách
    public void tinhTongSoLuong() {
        if (danhSachSach.size() == 0) {
            System.out.println("Vui long them sach truoc.");
            return;
        }

        int tong = 0;
        int i = 0;

        do {
            tong += Integer.parseInt(danhSachSach.get(i + 2));
            i += 4;
        } while (i < danhSachSach.size());

        System.out.println("Tong so luong sach: " + tong);
    }

    // Tính tổng giá trị sách
    public void tinhTongGiaTri() {
        if (danhSachSach.size() == 0) {
            System.out.println("Vui long them sach truoc.");
            return;
        }

        double tong = 0;
        int i = 0;

        do {
            int soLuong = Integer.parseInt(danhSachSach.get(i + 2));
            double donGia = Double.parseDouble(danhSachSach.get(i + 3));
            tong += soLuong * donGia;
            i += 4;
        } while (i < danhSachSach.size());

        System.out.println("Tong gia tri sach: " + tong);
    }

    // Menu chung quản lý thư viện
    public void menu(Scanner sc) {
        int chon;

        do {
            System.out.println("1. Them sach");
            System.out.println("2. Hien thi sach");
            System.out.println("3. Tim sach");
            System.out.println("4. Xoa sach");
            System.out.println("5. Sua sach");
            System.out.println("6. Tinh tong so luong");
            System.out.println("7. Tinh tong gia tri");
            System.out.println("8. Thoat");
            System.out.print("Chon: ");
            chon = Integer.parseInt(sc.nextLine());

            switch (chon) {
                case 1:
                    themSach(sc);
                    break;
                case 2:
                    hienThiSach();
                    break;
                case 3:
                    timSach(sc);
                    break;
                case 4:
                    xoaSach(sc);
                    break;
                case 5:
                    suaSach(sc);
                    break;
                case 6:
                    tinhTongSoLuong();
                    break;
                case 7:
                    tinhTongGiaTri();
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh.");
                    break;
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        } while (chon != 8);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ThuVien tv = new ThuVien();
        System.out.println("Bai 1");
        tv.bai1(sc);
        System.out.println("\n\nMenu bai4");
        tv.menu(sc);
    }
}