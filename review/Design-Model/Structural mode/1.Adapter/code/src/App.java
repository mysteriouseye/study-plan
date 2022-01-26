public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("类适配器模式测试!");
        Target target = new ClassAdapter();
        target.request();

        System.out.println("对象适配器模式测试!");
        Adapter adapter = new Adapter();
        Target target2 = new ObjectAdapter(adapter);
        target2.request();
    }
}
