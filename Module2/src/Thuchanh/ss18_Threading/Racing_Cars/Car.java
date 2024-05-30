package Thuchanh.ss18_Threading.Racing_Cars;

import java.util.Random;

import static Thuchanh.ss18_Threading.Racing_Cars.Main.DISTANCE;
import static Thuchanh.ss18_Threading.Racing_Cars.Main.STEP;

public class Car implements Runnable {


    private String name;

    public Car (String name) {
        this.name = name;
    }


    @Override
    public void run() {
        //khởi tạo điểm start (hay km ban đầu)
        int runDistance = 0;

        //khởi tạo time bắt đầu cuộc đua
        long startTime = System.currentTimeMillis();

        //kiểm tra chừng nào còn xe chưa kết thúc quãng đường đua thì xe vẫn tiếp tục chạy
        while (runDistance < DISTANCE) {
            try{
                //Random tốc độ Km/h
                int speed = (new Random()).nextInt(20);

                //Tính toán khoảng cách đã đi được
                runDistance += speed;

                //Vẽ đường đã đi của xe
                String log = "|";
                int percentTravel = (runDistance * 100) / DISTANCE;
                for (int i = 0; i < DISTANCE; i += STEP){
                    if (percentTravel >= i + STEP) {
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP) {
                        log += "o";
                    } else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("car" + this.name + ":" + log + " " + Math.min(DISTANCE, runDistance) + "Km");

                    Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Car" + this.name + " broken...");
                break;
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Car" + this.name + "Finish in " + (endTime - startTime)/1000 + "s");
        }
    }
}
