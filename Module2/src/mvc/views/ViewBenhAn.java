package mvc.views;

import mvc.models.BenhAn;
import mvc.models.BenhAnThuong;
import mvc.models.BenhAnVip;
import mvc.services.iml.BenhAnThuongServices;

import java.util.List;
import java.util.Scanner;

public class ViewBenhAn {
    BenhAnThuongServices service = new BenhAnThuongServices();
    List<BenhAn> benhAns = service.getAll();
    int count = benhAns.size();



    public int viewMeNu() {
        System.out.println("-------CHƯƠNG TRÌNH QUẢN LÝ BỆNH ÁN---------");
        System.out.println("Chọn chức năng theo số để tiếp tục:");
        System.out.println("1. Thêm mới danh sách bệnh nhân thường:");
        System.out.println("2. Xóa");
        System.out.println("3. Xem danh sách các bệnh án");
        System.out.println("4. Thoát");
        Scanner sc = new Scanner(System.in);
        System.out.println("Chọn chức năng:");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }

    public BenhAn viewAddBenhAn() {
        Scanner input = new Scanner(System.in);
        int stt = count++;
        System.out.println("Nhập mã bệnh án (BA-XXX): ");
        String maBenhAn = input.nextLine();
        System.out.println("Nhập mã bệnh nhân (BN-XXX): ");
        String maBenhNhan = input.nextLine();
        System.out.println("Nhập tên bênh nhân: ");
        String name = input.nextLine();
        System.out.println("Nhập ngày nhập viện (dd/MM/yyyy): ");
        String ngayNhapVien = input.nextLine();
        System.out.println("Nhập ngày xuất viện (dd/MM/yyyy): ");
        String ngayXuatVien = input.nextLine();
        System.out.println("Lý do nhập viện: ");
        String lyDoNhapVien = input.nextLine();
        System.out.println("Chọn loại bênh án: Nhấn T để chọn bênh án Thường, Nhấn V để chọn bệnh án Vip ");
        String check = input.nextLine();
        if (check.equals("T")) {
            System.out.println("Nhập chi phí năm viện (Đơn vị là VNĐ: ");
            int phiNamVien = Integer.parseInt(input.nextLine());

            BenhAnThuong benhAnThuong = new BenhAnThuong(stt,maBenhAn,maBenhNhan, name, ngayNhapVien, ngayXuatVien, lyDoNhapVien, phiNamVien );
            return benhAnThuong;
        } else {
            System.out.println("Chọn loại gói Vip (chỉ được chọn 1 trong 3 gói VIP I, VIP II, VIP III");
            String loaiVip = input.nextLine();
            System.out.println("Nhập thời gian gói Vip có hiệu lực:");
            String timeVip = input.nextLine();
            if (!((loaiVip.equals("VIP I")) || (loaiVip.equals("VIP II")) || (loaiVip.equals("VIP III")))) {
                System.out.println("Gói vip nhập chưa chính xác theo mẫu!");
                return null;
            }
            BenhAnVip benhAnVip = new BenhAnVip(stt,maBenhAn,maBenhNhan, name, ngayNhapVien, ngayXuatVien, lyDoNhapVien,loaiVip,timeVip);
            return benhAnVip;
        }
    }


    public void messageAdd(boolean check) {
        if (check) {
            System.out.println("Thêm bệnh án mới thành công");
        } else {
            System.out.println("Thêm bệnh án thất bại");
        }
    }

    public void displayAllBenhAn(List<BenhAn> benhAns) {
        System.out.println("----Danh sách bệnh án----");
        int count = 0;
        for (BenhAn benhAn : benhAns) {
            count++;
            System.out.println(count + "," + benhAn.toString());
        }
    }

    public String remove() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập vào mã bệnh án cần xóa: ");
        String maBenhAn = input.nextLine();
        return maBenhAn;
    }

    public boolean confirmDelete(BenhAn benhAn) {
        System.out.println("Bạn có chắc chắn muốn xóa bênh án có mã: " + benhAn.getMaBenhAn() + " này không ? Bấm YES để xác nhận xóa, Bấm NO để hủy thao tác.");
        Scanner input = new Scanner(System.in);
        String confirm = input.nextLine();
        if (confirm.equals("YES")) {
            return true;
        } else {
            return false;
        }
    }

    public void messageDelete(boolean result) {
        if (result) {
            System.out.println("Xóa bênh án thành công");
        } else {
            System.out.println("Xóa bênh án thất bại");
        }
    }


}
