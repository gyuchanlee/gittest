package thread;

public class Thread1 {

    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("스레드 코드 실행");
            }
        });
        thread.start();
    }
}
