package mvc.models;

public class BenhAnVip extends BenhAn {

    private String loaiVip;
    private String timeVip;

    public BenhAnVip() {
    }

    public BenhAnVip(String loaiVip, String timeVip) {
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public BenhAnVip(int soThuTu, String maBenhAn, String maBenhNhan, String name, String ngayNhapVien, String ngayRaVien, String lyDoNhapVien, String loaiVip, String timeVip) {
        super(soThuTu, maBenhAn, maBenhNhan, name, ngayNhapVien, ngayRaVien, lyDoNhapVien);
        this.loaiVip = loaiVip;
        this.timeVip = timeVip;
    }

    public String getTimeVip() {
        return timeVip;
    }

    public void setTimeVip(String timeVip) {
        this.timeVip = timeVip;
    }

    public String getLoaiVip() {
        return loaiVip;
    }

    public void setLoaiVip(String loaiVip) {
        this.loaiVip = loaiVip;
    }

    public String toString() {
        return super.toString() + "," + getLoaiVip() + "," + getTimeVip();
    }
}
