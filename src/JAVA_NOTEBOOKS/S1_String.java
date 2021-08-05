package JAVA_NOTEBOOKS;


public class S1_String {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = new String("hello");

        run3();
    }

    public static void run1() {
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
        //str4是重新new的一个对象，是在堆空间又单独存储的，也就是说str3和str4的地址是不一样的，但是存储内容是一样的。读者可以运行一下下面的代码：
    }

    public static void run2() {
        //        对于String类对象是不可变字符的理解：
        String str1 = "hellow";
        String str2 = str1;
        str1 = str1.substring(0, 3) + "p!";
        System.out.println(str1);
        System.out.println(str2);
        //因为第2行代码是让str1和str2指向了同一个地址段，后面改变了str1的指向，而str2指向的东西是没有改变的。


    }

    public static void run3() {
        //说明了s1和s2指向的同一个地址段，s3和s4指向的是不同的地址段，而存储内容是一样的
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        String s3 = new String("hello");
        String s4 = new String("hello");
        System.out.println(s3 == s4);

        String str1 = "hello";
        String str2 = str1;
        str1 = str1.substring(0, 3) + "p!";
        System.out.println(str1);
        System.out.println(str2);






/*        你养兰花不是今天用来生气的。
        昨日黄土陇头送白骨，今宵红灯帐底卧鸳鸯。
        我认为这些真理是不言自明了，人人生来平等，造物主赋予他们一定的不可让与的权利，这些权利有生活的权利、自由的权利和追求幸福的权利。为了取得这些权利，人类创建了政府，政府则从被治理的同意中得到权利。任何政府形式一但有背这些目的，人民就有权改变或废除它，组织新的政府······
——《独立宣言》*/

    }


}
