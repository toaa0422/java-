package JAVA_NOTEBOOKS.s9_javabean;

public class Maintest {
    public static void main(String[] args){
        BeanTest beantest1=new BeanTest();
        beantest1.setId(1234567);
        beantest1.setName("帅哥");
        beantest1.setPassword("123456");
        System.out.println(beantest1.getId());
        System.out.println(beantest1.getName());
        System.out.println(beantest1.getPassword());
    }
}