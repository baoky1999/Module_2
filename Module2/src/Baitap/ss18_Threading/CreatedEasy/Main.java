package Baitap.ss18_Threading.CreatedEasy;

public class Main {

    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator(10);

        Thread thread = new Thread(numberGenerator);
        thread.start();
    }
}
