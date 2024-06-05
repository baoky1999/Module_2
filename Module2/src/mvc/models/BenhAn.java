package mvc.models;

import java.util.ArrayList;

public abstract class BenhAn extends ArrayList<BenhAn> {

    private int soThuTu;
    private String maBenhAn;
    private String maBenhNhan;
    private String name;
    private String ngayNhapVien;
    private String ngayRaVien;
    private String lyDoNhapVien;

    public BenhAn() {
    }

    public BenhAn(int soThuTu, String maBenhAn, String maBenhNhan, String name, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien) {
        this.soThuTu = soThuTu;
        this.maBenhNhan = maBenhNhan;
        this.maBenhAn = maBenhAn;
        this.lyDoNhapVien = lyDoNhapVien;
        this.ngayRaVien = ngayRaVien;
        this.ngayNhapVien = ngayNhapVien;
        this.name = name;
    }

    public int getSoThuTu() {
        return soThuTu;
    }

    public void setSoThuTu(int soThuTu) {
        this.soThuTu = soThuTu;
    }

    public String getMaBenhAn() {
        return maBenhAn;
    }

    public void setMaBenhAn(String maBenhAn) {
        this.maBenhAn = maBenhAn;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNgayNhapVien() {
        return ngayNhapVien;
    }

    public void setNgayNhapVien(String ngayNhapVien) {
        this.ngayNhapVien = ngayNhapVien;
    }

    public String getNgayRaVien() {
        return ngayRaVien;
    }

    public void setNgayRaVien(String ngayRaVien) {
        this.ngayRaVien = ngayRaVien;
    }

    public String getLyDoNhapVien() {
        return lyDoNhapVien;
    }

    public void setLyDoNhapVien(String lyDoNhapVien) {
        this.lyDoNhapVien = lyDoNhapVien;
    }

    public String toString() {
        return getMaBenhAn() + "," + getMaBenhNhan() + "," + getName() + "," + getNgayNhapVien() + ","
                + getNgayRaVien() + "," + getLyDoNhapVien();
    }
}
