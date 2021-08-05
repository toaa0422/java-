package JAVA_NOTEBOOKS.s12_spring_case1;

public class Person {
    private BaoMa baoma;
    public Person(){
        baoma=new BaoMa();//Person和Baoma这个类紧耦合
    }
    public void driver(){
        baoma.GuaDang();
        baoma.CaiYouMen();
        baoma.DaFangXiang();
    }
}
