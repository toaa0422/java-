package JAVA_NOTEBOOKS.s8_thread;

public class NoThreadTest {
    private String noThread1;

    public NoThreadTest() {
    }

    public NoThreadTest(String noThread1) {
        this.noThread1 = noThread1;
    }

    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(noThread1 + "非多线程运行结果                             " + i);
        }
    }

    public static void main(String[] args) {
        NoThreadTest maintest1 = new NoThreadTest("我是A");
        NoThreadTest maintest2 = new NoThreadTest("我是B");
        maintest1.run();
        maintest2.run();
    }
}
