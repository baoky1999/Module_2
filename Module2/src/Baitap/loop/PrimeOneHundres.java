package Baitap.loop;

public class PrimeOneHundres {

    public static void main(String[] args) {
        boolean check = true;
        int i;
        for (i = 2; i <= 100; i++) {
            for (int j = 2; j <= Math.sqrt(i); j++) {

                if (i % j == 0) {
                    check = false;
                    break;
                }
                check = true;
            }
            if (check) {
                System.out.print(i + ", ");
            }
        }

    }
}
