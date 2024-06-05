package Thuchanh.ss22_Structural_Design_Pattern.Adapter;

import com.codegym.FileUtil;

import java.io.File;

public class FileCalculatorAdapter implements FileCalculator {
    @Override
    public long calculateSize(String path) {
        FileUtil fileUtil = new FileUtil();
        File file = new File(path);
        return fileUtil.calculateSize(file);
    }
}
