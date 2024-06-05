package mvc.controllers;

import mvc.models.BenhAn;
import mvc.repositories.BenhAnRepositories;
import mvc.services.iml.BenhAnThuongServices;
import mvc.views.ViewBenhAn;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MainControllers {

    public static void main(String[] args) {

        ViewBenhAn viewBenhAn = new ViewBenhAn();
        BenhAnThuongServices benhAnThuongService = new BenhAnThuongServices();
        BenhAnRepositories benhAnRepositories = new BenhAnRepositories();
        int choice;
        boolean check;
        List<BenhAn> benhAn;
        List<BenhAn> BenhAnList;
        while (true) {
            choice = viewBenhAn.viewMeNu();
            switch (choice) {
                case 1:
                    benhAn = viewBenhAn.viewAddBenhAn();
                    check = benhAnThuongService.addBenhAn((BenhAn) benhAn);
                    viewBenhAn.messageAdd(check);
                    break;
                case 2:
                    String removeBenhAn = viewBenhAn.remove();
                    benhAn = benhAnThuongService.findMaBenhAn(removeBenhAn);
                    if (benhAn == null) {
                        viewBenhAn.messageDelete(false);
                    } else {
                        boolean isConfirm = viewBenhAn.confirmDelete((BenhAn) benhAn);
                        if (isConfirm) {
                            benhAnRepositories.remove((BenhAn) benhAn);
                            viewBenhAn.messageDelete(true);
                            BenhAnList = benhAnThuongService.getAll();
                            viewBenhAn.displayAllBenhAn(BenhAnList);
                            return;
                        } else {
                            viewBenhAn.messageDelete(false);
                        }
                    }
                    break;
                case 3:
                    BenhAnList = benhAnThuongService.getAll();
                    viewBenhAn.displayAllBenhAn(BenhAnList);
                    break;
                case 4:
                    return;
            }
        }
    }
}
