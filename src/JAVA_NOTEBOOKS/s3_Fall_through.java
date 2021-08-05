package JAVA_NOTEBOOKS;

public class s3_Fall_through {
//    今天看到switch语句中可能发现Fall-through现象，一时不明白是什么意思，就学习了一下，下面代码中的第二个switch就发现了Fall-through现象。


    public static void main(String[] args) {
        int i = 2;
        switch (i) {
            case 1:
                System.out.println("woshishuaige1");
                break;
            case 2:
                System.out.println("woshishuaige2");
                break;
            case 3:
                System.out.println("woshishuaige3");
                break;
            default:
                System.out.println("xiaosile");
        }
        switch (i) {
            case 1:
                System.out.println("我是帅哥1");
            case 2:
                System.out.println("我是帅哥2");
            case 3:
                System.out.println("我是帅哥3");
            default:
                System.out.println("笑死了");
        }
    }
}
