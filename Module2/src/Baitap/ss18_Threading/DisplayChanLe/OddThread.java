package Baitap.ss18_Threading.DisplayChanLe;

public class OddThread extends Thread {

    public void run() {
        for (int i = 1; i < 10; i = i + 2) {
            System.out.println("Số lẻ: " + i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
