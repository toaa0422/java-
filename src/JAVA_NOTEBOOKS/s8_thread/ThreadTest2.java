package JAVA_NOTEBOOKS.s8_thread;

public class ThreadTest2 implements Runnable {
    private String Thread1;
    public ThreadTest2(){
    }
    public ThreadTest2(String Thread1){
        this.Thread1=Thread1;
    }
    public void run(){
        for(int i=0;i<3;i++){//可以参看评论5，效果会好一些
            System.out.println(Thread1+"多线程运行结果                                 "+i);
        }
    }
    public static void main(String[] args){
        ThreadTest2 maintest1=new ThreadTest2("我是A");
        ThreadTest2 maintest2=new ThreadTest2("我是B");
        Thread maintest4=new Thread(maintest1);
        Thread maintest5=new Thread(maintest2);
        maintest1.run();
        maintest2.run();
        System.out.println("..............我是分割线1........................");
        maintest4.run();
        maintest5.run();
        System.out.println("..............我是分割线2........................");
        maintest4.start();
        maintest5.start();
    }

//    1. run方法和start方法的区别：
//    java核心技术中有这样一段话：不要调用Thread类或Runnable对象的run方法。
//    直接调用run方法，只会执行同一个线程中的任务，而不会启动新线程。应该调用Thread.start方法。这个方法将创建一个执行run方法的新线程。
//    2. 在上面第三段代码中，ThreadTest2类，Thread类和Runnerable接口都实现了run方法。

        /*public
        interface Runnable {
            *//**
             * When an object implementing interface <code>Runnable</code> is used
             * to create a thread, starting the thread causes the object's
             * <code>run</code> method to be called in that separately executing
             * thread.
             * <p>
             * The general contract of the method <code>run</code> is that it may
             * take any action whatsoever.
             *
             * @see     java.lang.Thread#run()
             *//*
            public abstract void run();
        }*/
//    3)为什么要说这个？因为这个实现是使用了代理模式。
//
//    代理:一个角色代表另一个角色来完成某些特定的功能。
//
//    举个例子：大家都买过衣服，所以在买衣服的时候，一般有下面的角色：
//
//    购物者：我们一般是从代理商那里买衣服，我们并不和制造商进行交涉，我们不关心衣服是如何生产出来的。
//
//    代理商：代理商是从制造商那里拿衣服，并且代理商可以提供一些简单的服务，比如裁剪裤子等。
//
//    制造商：制造衣服，并且批发衣服给代理商。
//
//    我们从上面的行为中可以抽象出，一个行为就是卖衣服这个行为在代理商和制造商都有，如果购物者要买衣服，也需要以代理商和制造商卖衣服为前提。
//
//    从上面我们可以抽象出三个角色，并不是和上面对应的哈。
//
//    抽象主题角色：这个使我们可以抽象出来的角色。就是卖衣服这个行为。
//
//    代理主题角色：中间商。
//
//    实际被代理角色：制造商。
}
