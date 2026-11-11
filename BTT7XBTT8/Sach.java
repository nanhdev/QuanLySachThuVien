class Sach {
    //Yêu cầu 1
    private String maSach;
    private String tieuDe;
    private String tacGia;
    private int namXuatBan;
    private int soLuong;
    //Yêu cầu 4
    public Sach(String ms, String tieude, String tacgia, int nxb, int soluong) {
        this.maSach = ms;
        this.tieuDe = tieude;
        this.tacGia = tacgia;
        setNamXuatBan(nxb);
        setSoLuong(soluong);
    }
    //Yêu cầu 2
    //Phương thức getter
    public String getMaSach() {
        return maSach;
    }
    public String getTieuDe(){
        return tieuDe;
    }
    public String getTacGia(){
        return tacGia;
    }
    public int getNamXuatBan(){
        return namXuatBan;
    }
    public int getSoLuong(){
        return soLuong;
    }
    //Phương thức setter
    public void setMaSach(String maSach){
        this.maSach = maSach;
    }
    public void setTieuDe(String tieuDe){
        this.tieuDe = tieuDe;
    }
    public void setTacGia(String tacGia){
        this.tacGia= tacGia;
    }
    //Yêu cầu 3
    public void setNamXuatBan(int namXuatBan){
        int namHienTai = 2026;
        if(namXuatBan > 0 && namXuatBan <= namHienTai){
            this.namXuatBan = namXuatBan;
        }
        else {
            System.out.println("Nam xuat ban khong hop le");
        }
    }
    public void setSoLuong(int soLuong){
        if (soLuong>=0){
        this.soLuong = soLuong;
        }
        else {
            System.out.println("So luong khong hop le");
        }
    }
    public void hienThiThongTin() {
        System.out.println("Ma sach: " + maSach);
        System.out.println("Tieu de: " + tieuDe);
        System.out.println("Tac gia: " + tacGia);
        System.out.println("Nam xuat ban: " + namXuatBan);
        System.out.println("So luong: " + soLuong);
    }
}
