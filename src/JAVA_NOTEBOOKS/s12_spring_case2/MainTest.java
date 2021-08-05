package JAVA_NOTEBOOKS.s12_spring_case2;

public class MainTest {
    public static void main(String[] args){
        AuDi audi=new AuDi();
        Person boy =new Person(audi);
        boy.driver();
    }
}