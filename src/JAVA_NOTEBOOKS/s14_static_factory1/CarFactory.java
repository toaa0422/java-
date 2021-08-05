package JAVA_NOTEBOOKS.s14_static_factory1;

public class CarFactory {
    public static Car getCarInstance(String type){//静态方法，这样做的缺点是如果CarFactory被继承，getCar不能被重写。
        Car carInstance = null;
        if(type.equals("audi")){
            carInstance=new AuDi();
        }else if(type.equals("baoma")){
            carInstance=new BaoMa();
        }else if(type.equals("suv")){
            carInstance=new Suv();
        }
        return carInstance;
    }
}
