package JAVA_NOTEBOOKS.s8_thread;

public class ThreadTest7 implements Runnable {
    private int num=3;//定义飞机票的张数
    public void run(){
        for(int i=0;i<10;i++){
            if(num>0){
                System.out.println(Thread.currentThread().getName()+"飞机票还剩余num= "+num--);
            }
        }
    }
    public static void main(String[] args){
        ThreadTest7 threadtest1=new ThreadTest7();
        Thread thread1=new Thread(threadtest1,"窗口1");
        Thread thread2=new Thread(threadtest1,"窗口2");
        Thread thread3=new Thread(threadtest1,"窗口3");
        thread1.start();
        thread2.start();
        thread3.start();
    }
//    要实现这个飞机售票程序，我们只能创建一个资源对象，但要创建多个线程去处理同一个资源对象，并且每个线程上所运行的是相同的程序代码。
//    这就是第三段代码实现的结果，ThreadTest7只创建了一个资源对象——threadtest1。创建了三个线程，
//    每个线程调用的是同一个threadtest1对象中的run()方法，访问的是同一个对象中的变量（num）的实例，这个程序满足了我们的需求。

//     3. 结论：
//    可见，实现Runnable接口相对于继承Thread类来说，有如下显著的好处：
//    (1)适合多个相同程序代码的线程去处理同一资源的情况，把虚拟CPU（线程）同程序的代码，数据有效的分离，较好地体现了面向对象的设计思想。
//    (2)可以避免由于Java的单继承特性带来的局限。我们经常碰到这样一种情况，即当我们要将已经继承了某一个类的子类放入多线程中，
//    由于一个类不能同时有两个父类，所以不能用继承Thread类的方式，那么，这个类就只能采用实现Runnable接口的方式了。
//    (3)有利于程序的健壮性，代码能够被多个线程共享，代码与数据是独立的。当多个线程的执行代码来自同一个类的实例时，
//    即称它们共享相同的代码。多个线程操作相同的数据，与它们的代码无关。当共享访问相同的对象是，即它们共享相同的数据。
//    当线程被构造时，需要的代码和数据通过一个对象作为构造函数实参传递进去，这个对象就是一个实现了Runnable接口的类的实例。

    
}

