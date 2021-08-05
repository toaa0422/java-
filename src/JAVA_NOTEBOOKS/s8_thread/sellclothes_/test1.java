package JAVA_NOTEBOOKS.s8_thread.sellclothes_;

public class test1 {
    public static void main(String[] args) {
        Manufacturer t = new Manufacturer();
        Middleman sellclothes = new Middleman(t);
        sellclothes.sellClothes();
    }
}
