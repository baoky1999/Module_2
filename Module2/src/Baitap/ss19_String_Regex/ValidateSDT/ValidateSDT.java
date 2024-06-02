package Baitap.ss19_String_Regex.ValidateSDT;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateSDT {

    private static Pattern pattern;
    private static Matcher matcher;

    private static final String SDT_REGEX = "^\\([0-9]{2}\\)-\\(0[0-9]{9}\\)$";

    public ValidateSDT() {
        pattern = Pattern.compile(SDT_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
