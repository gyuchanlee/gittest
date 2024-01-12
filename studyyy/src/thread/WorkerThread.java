package thread;

public class WorkerThread extends Thread {

    @Override
    public void run() {
        System.out.println("워커 스레드입니다~~");
        System.out.println("워커 스레드입니다~~");
        System.out.println("워커 스레드입니다~~");
    }


    public static void main(String[] args) {
        // Thread 상속받은 자식 스레드로 실행.
        WorkerThread workerThread = new WorkerThread();
        workerThread.start();

        System.out.println();

        // 익명 자식 스레드 > 많이 사용
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("익명 자식 스레드입니다~~");
            }
        };
        thread.start();
    }
}
