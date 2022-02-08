package Example;

public class Goods implements Articles {
    private String name;
    private int quantity;
    private float price;
    public Goods(String name, int quantity, float price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public float caculator() {
        // TODO Auto-generated method stub
        return quantity * price;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        System.out.println(name + "(数量：" + quantity + "，单价：" + price + "元)");
    }
    
}
