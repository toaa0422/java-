package JAVA_NOTEBOOKS.s8_thread;

public class ThreadTest5 implements Runnable {
    private int num=3;//定义飞机票的张数
    public void run(){
        for(int i=0;i<10;i++){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"飞机票还剩余num= "+num--);
            }
        }
    }
    public static void main(String[] args){
        ThreadTest5 threadtest1=new ThreadTest5();
        ThreadTest5 threadtest2=new ThreadTest5();
        ThreadTest5 threadtest3=new ThreadTest5();
        Thread thread1=new Thread(threadtest1,"窗口1");
        Thread thread2=new Thread(threadtest2,"窗口2");
        Thread thread3=new Thread(threadtest3,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}