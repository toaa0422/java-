package JAVA_NOTEBOOKS.s14_static_factory1;
public class Manager {
    Car car = null;
    public  Car CreatCar(String type){//Manager类和具体类解耦合，不需要关心具体的类的实现方法。
        car=CarFactory.getCarInstance(type);//静态方法，不需要使用创建工厂CarFactory来创建对象，直接使用CarFactory来调用其方法。
        car.Prepare();
        car.Install();
        car.Color();
        return car;
    }
}
//public class Manager {
//    public static Car CreatCar(String type){
//        Car car = null;//Manager与Audi类和BaoMa类还有Suv类耦合，进行了硬编码
//        if(type.equals("audi")){
//            car=new AuDi();
//        }else if(type.equals("baoma")){
//            car=new BaoMa();
//        }else if(type.equals("suv")){
//            car=new Suv();
//        }
//        car.Prepare();
//        car.Install();
//        car.Color();
//        return car;
//    }
//}
