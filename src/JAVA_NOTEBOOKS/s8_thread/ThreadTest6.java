package JAVA_NOTEBOOKS.s8_thread;

public class ThreadTest6 extends Thread {
    private int num=3;//定义飞机票的张数
    public void run(){
        for(int i=0;i<10;i++){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"飞机票还剩余num= "+num--);
            }
        }
    }
    public static void main(String[] args){
        ThreadTest6 threadtest1=new ThreadTest6();
        ThreadTest6 threadtest2=new ThreadTest6();
        ThreadTest6 threadtest3=new ThreadTest6();
        threadtest1.start();
        threadtest2.start();
        threadtest3.start();

    }
}
