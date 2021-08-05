package JAVA_NOTEBOOKS.s8_thread.sellclothes_;

//代理主题角色：中间商
public class Middleman implements SellClothes{
    private SellClothes t;
    public Middleman(SellClothes t) {
        super();
        this.t = t;
    }
    public void sellClothes() {
        t.sellClothes();
        System.out.println("我是中间商，我买的是制造商的衣服");
        System.out.println("我是中间商，我还提供对裤子不合适的进行裁剪服务");
    }
}