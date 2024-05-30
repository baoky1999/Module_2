package Baitap.ss18_Threading.CreatedEasy;

public class NumberGenerator implements Runnable {

    private int numBer;

    public NumberGenerator(int numBer) {
        this.numBer = numBer;
    }

    @Override
    public void run() {
       try {
           for (int i = 0; i <= numBer; i++) {
               System.out.println("Number:  " + i
               + ", Hashcode: " + this.hashCode() );
               Thread.sleep(500);
           }
       } catch (InterruptedException e) {
           System.out.println("Ngoại lệ bị gián đoạn");
       }
    }
}
