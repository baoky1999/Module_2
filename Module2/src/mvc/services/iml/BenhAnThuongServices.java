package mvc.services.iml;

import mvc.models.BenhAn;
import mvc.repositories.BenhAnRepositories;
import mvc.services.Services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BenhAnThuongServices implements Services {
    BenhAnRepositories benhAnRepositories = new BenhAnRepositories();

    @Override
    public boolean addBenhAn(BenhAn benhAn) {
        List<BenhAn> danhSach;
        danhSach = BenhAnRepositories.getAll();
        for (BenhAn b : danhSach) {
            if (b.getMaBenhAn().equals(benhAn.getMaBenhAn())) {
                System.out.println("Bệnh án đã tồn tại!");
                return false;
            }
        }
        if (benhAn.getMaBenhAn().equals(" ") && benhAn.getMaBenhNhan().equals(" ")) {
            System.out.println("Không được để trống ngày tháng!");
            return false;
        }
        if (!(benhAn.getMaBenhNhan().matches("^BN-\\d{3}$")) || !(benhAn.getMaBenhAn().matches("^BA-\\d{3}$"))) {
            System.out.println("Định dạng mã bênh nhân hoặc bệnh án chưa đúng!");
            return false;
        }
        if (!(isCheckFormatDay(benhAn.getNgayNhapVien(),"dd/MM/yyyy" ))) {
            System.out.println("Ngày nhập viện chưa đúng định dạng!");
            return false;
        }
        if (!(isCheckFormatDay(benhAn.getNgayRaVien(), "dd/MM/yyyy" ))) {
            System.out.println("Ngày ra viện chưa đúng định dạng!");
        }
        if (!(isCheckDay(benhAn.getNgayNhapVien(),benhAn.getNgayRaVien()))) {
            System.out.println("Ngày ra viện phải lớn hơn ngày nhập viện!");
            return false;
        }

        benhAnRepositories.add(benhAn);
        return true;
    }

    public boolean isCheckFormatDay(String day, String format) {
        SimpleDateFormat formatter = new SimpleDateFormat(format);
        formatter.setLenient(false);
        try{
            formatter.parse(day);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public boolean isCheckDay(String day, String afterDay) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate dayVao = LocalDate.parse(day, formatter);
        LocalDate afterDayRa = LocalDate.parse(afterDay, formatter);
        return !afterDayRa.isBefore(dayVao);
    }

    @Override
    public List<BenhAn> getAll() {
        return BenhAnRepositories.getAll();
    }

    @Override
    public BenhAn findMaBenhAn(String maBenhAn) {
        List<BenhAn> benhAns = getAll();
        for (BenhAn benhAn : benhAns) {
            if(benhAn.getMaBenhAn().equals(maBenhAn)){
                return benhAn;
            }
        }
        return null;
    }

    @Override
    public void removeBenhAn(BenhAn benhAn) {
        benhAnRepositories.remove(benhAn);
    }

}
