class Sach {
    //Yêu cầu 1
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    
    public Sach(String ms , String tieude, String tacgia , int nxb, int soluong){
        this.maSach = ms;
        this.tieuDe= tieude;
        this.tacGia = tacgia;
        this.namXuatBan = nxb;
        this.soLuong = soluong;
    }
    //Yêu cầu 2
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}
