package Thuchanh.ss18_Threading.taoLuong_Runnable;

public class Main {

    public static void main(String[] args) {
        System.out.println("Main thread running...");

        RunnableDemo runnableDemo1 = new RunnableDemo("Thead-1-HR-Database");
        runnableDemo1.start();

        RunnableDemo runnableDemo2 = new RunnableDemo("Thead-2-Send-Email");
        runnableDemo2.start();

        System.out.println("Main thread stopped!");
    }
}
