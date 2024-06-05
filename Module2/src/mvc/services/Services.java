package mvc.services;

import mvc.models.BenhAn;

import java.util.List;

public interface Services {

    boolean addBenhAn(BenhAn t);
    List<BenhAn> getAll();
    BenhAn findMaBenhAn(String maBenhAn);
    void removeBenhAn(BenhAn benhAn);

}
