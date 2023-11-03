import ra.StopWatch;
import ra.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(System.currentTimeMillis());
        Scanner sc= new Scanner(System.in);
        StopWatch watch = new StopWatch();
        watch.start(); // bắt đầu bấm giờ
//        System.out.println("Nhập 1 số");
//        int a = Integer.parseInt(sc.nextLine());
//        System.out.println("Nhập 1 chuỗi");
//        String str = sc.nextLine();
        while (true){
            System.out.println("Nhập sô 0 đề dừng");
            int so = Integer.parseInt(sc.nextLine());
            if(so == 0){
                watch.stop(); // kết thúc bấm giờ
                break;
            }
        }
        System.out.println("Sự chênh lệch thời gian : "
                + watch.getElapsedTime() + " milliseconds");


    }
}