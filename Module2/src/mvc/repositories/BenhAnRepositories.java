package mvc.repositories;

import mvc.models.BenhAn;
import mvc.models.BenhAnThuong;
import mvc.models.BenhAnVip;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositories {

    private static final String URL_DATA = "D:\\Module_2\\Module2\\src\\mvc\\repositories\\data\\medical_records.csv";
    List<BenhAn> benhAns = new ArrayList<>();

    public void add(BenhAn benhAn) {
        benhAns.add(benhAn);
        writeFile(benhAn, true);
    }

    public static List<BenhAn> getAll() {
        List<BenhAn> benhAns = new ArrayList<>();
        File file = new File(URL_DATA);

        try(FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader))
        {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] t = line.split(",");
                if (t.length == 8) {
                    benhAns.add(new BenhAnThuong(Integer.parseInt(t[0]),t[1],t[2],t[3],t[4],t[5],t[6],Integer.parseInt(t[7])));
                } else {
                    benhAns.add(new BenhAnVip(Integer.parseInt(t[0]),t[1],t[2],t[3],t[4],t[5],t[6],t[7],t[8]));
                }

            }

        } catch (FileNotFoundException e) {
            System.out.println("Không tìm thất File");
        } catch (IOException e) {
            System.out.println("Lỗi đọc dữ liệu File");
        }
        return benhAns;
    }

    public void remove(BenhAn benhAn) {
        List<BenhAn> benhAns = getAll();
        for (BenhAn b:benhAns) {
            if (b.getMaBenhAn().equals(benhAn.getMaBenhAn())) {
                benhAns.remove(b);
                break;
            }
        }
        for (BenhAn b:benhAns) {
            writeFile(b, false);
        }


    }

    private void writeFile(List<BenhAn> benhAns, boolean append) {
        File file = new File(URL_DATA);
        try (FileWriter fileWriter = new FileWriter(file, append);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter))
        {
            if (benhAns instanceof BenhAnThuong ) {
                bufferedWriter.write(toString((BenhAn) benhAns));
                bufferedWriter.newLine();
            } else if (benhAns instanceof BenhAnVip ) {
                bufferedWriter.write(toString2((BenhAn) benhAns));
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println("Lỗi ghi File!");
        }
    }

    public String toString(BenhAn benhAns) {
        return benhAns.getSoThuTu() + "," + benhAns.getMaBenhAn() + "," + benhAns.getMaBenhNhan() + ","
                + benhAns.getName() + "," + benhAns.getNgayNhapVien() + "," + benhAns.getNgayRaVien() + ","
                + benhAns.getLyDoNhapVien() + "," + ((BenhAnThuong) benhAns).getPhiNamVien();
    }

    public String toString2(BenhAn benhAns) {
        return benhAns.getSoThuTu() + "," + benhAns.getMaBenhAn() + "," + benhAns.getMaBenhNhan() + ","
                + benhAns.getName() + "," + benhAns.getNgayNhapVien() + "," + benhAns.getNgayRaVien() + ","
                + benhAns.getLyDoNhapVien() + "," + ((BenhAnVip) benhAns).getLoaiVip() + "," + ((BenhAnVip) benhAns).getTimeVip();
    }


}
