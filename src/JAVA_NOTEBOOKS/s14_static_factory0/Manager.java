package JAVA_NOTEBOOKS.s14_static_factory0;

public class Manager {
    public static Car CreatCar(String type){
        Car car = null;//Manager与Audi类和BaoMa类还有Suv类耦合，进行了硬编码
        if(type.equals("audi")){
            car=new AuDi();
        }else if(type.equals("baoma")){
            car=new BaoMa();
        }else if(type.equals("suv")){
            car=new Suv();
        }
        car.Prepare();
        car.Install();
        car.Color();
        return car;
    }
}
