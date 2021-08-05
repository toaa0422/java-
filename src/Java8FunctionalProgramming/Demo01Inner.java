package Java8FunctionalProgramming;

public class Demo01Inner {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hello world");
            }
        }).start();
        new Thread(() -> System.out.println(Thread.currentThread().getName() + "执行了")).start();

    }
}



