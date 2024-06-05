package mvc.models;

public class BenhAnThuong extends BenhAn {

    private int phiNamVien;

    public BenhAnThuong() {
    }

    public BenhAnThuong(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public BenhAnThuong(int soThuTu, String maBenhAn, String maBenhNhan, String name, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, int phiNamVien) {
        super(soThuTu, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.phiNamVien = phiNamVien;
    }

    public int getPhiNamVien() {
        return phiNamVien;
    }

    public void setPhiNamVien(int phiNamVien) {
        this.phiNamVien = phiNamVien;
    }

    public String toString() {
        return super.toString() + "," + getPhiNamVien();
    }
}
