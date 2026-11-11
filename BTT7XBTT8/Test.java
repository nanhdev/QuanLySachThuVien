import java.util.ArrayList;
class Test {
    public static void main(String[] args) {
        ArrayList<Sach> danhsachsach = new ArrayList<>();
        Sach sach1 = new Sach("MS001", "Ngu van", "NXB GDVN", 1941, 5);
        Sach sach2 = new Sach("MS002", "Toan", "NXBVN", 1975, 5);
        danhsachsach.add(sach1);
        danhsachsach.add(sach2);
        Sach sachDuocLay = danhsachsach.get(0);
        System.out.println("Tieu de sach dau tien: " + sachDuocLay.getTieuDe());
        sachDuocLay.setSoLuong(10);
        danhsachsach.get(0).hienThiThongTin();
        danhsachsach.get(1).hienThiThongTin();
    }
}