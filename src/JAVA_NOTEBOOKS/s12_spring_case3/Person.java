package JAVA_NOTEBOOKS.s12_spring_case3;

public class Person {
    private Car car;
    public Person(Car car){//构造器注入，传入的是car，也就是一个所有车型都必须实现的接口
        this.car =car;//这里可以响应奥迪，宝马等任何一种车的实现。
    }//这里Person类没有与任何特定类型的车发生耦合，对于Person来说，任何一种特定的车，只需要实现Car接口即可。具体是哪一种车型，对Person来说无关紧要。
    public void driver(){
        car.GuaDang();
        car.CaiYouMen();
        car.DaFangXiang();
    }
}