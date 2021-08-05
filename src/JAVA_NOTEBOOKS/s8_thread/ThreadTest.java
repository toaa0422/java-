package JAVA_NOTEBOOKS.s8_thread;

public class ThreadTest extends Thread {
    private String Thread1;

    public ThreadTest() {
    }

    public ThreadTest(String Thread1) {
        this.Thread1 = Thread1;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {//可以参看评论5进行修改，效果会好一些。
            System.out.println(Thread1 + "多线程运行结果                                 " + i);
//            try {
//                Thread.sleep(200);// 要点
//            } catch (InterruptedException e) {
//            // TODO 自动生成的 catch 块
//                e.printStackTrace();
//            }
        }
    }

    public static void main(String[] args) {
        ThreadTest maintest1 = new ThreadTest("我是A");
        ThreadTest maintest2 = new ThreadTest("我是B");
        maintest1.run();
        maintest2.run();
        System.out.println("..............我是分割线........................");
        maintest1.start();
        maintest2.start();
    }
}
