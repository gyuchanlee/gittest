package thread;

import java.awt.*;

public class BeepPrint {

    public static void main(String[] args) {

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for (int i = 0; i < 5; i++) {
                    toolkit.beep();
                    System.out.println("삡");
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        System.out.println("error");
                    }
                }
            }
        });

        thread.start();


        for (int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("error");
            }
        }
    }
}
