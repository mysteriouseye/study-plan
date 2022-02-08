public class App {
    // 假如要访问集合 c0={leaf1,{leaf2,leaf3}} 中的元素
    public static void main(String[] args) throws Exception {
        Component c0 = new Composite();
        Component c1 = new Composite();
        Component leaf1 = new Leaf("1");
        Component leaf2 = new Leaf("2");
        Component leaf3 = new Leaf("3");
        c0.add(leaf1);
        c0.add(c1);
        c1.add(leaf2);
        c1.add(leaf3);
        c0.operation();
        /**
         * 安全组合模式
         * 安全式的组合模式与透明式组合模式的实现代码类似，只要对其做简单修改就可以了，代码如下。
         * 
         * 首先修改 Component 代码，只保留层次的公共行为。
         * interface Component {
         * public void operation();
         * }
         * 然后修改客户端代码，将树枝构件类型更改为 Composite 类型，以便获取管理子类操作的方法。
         * public class CompositePattern {
         * public static void main(String[] args) {
         * Composite c0 = new Composite();
         * Composite c1 = new Composite();
         * Component leaf1 = new Leaf("1");
         * Component leaf2 = new Leaf("2");
         * Component leaf3 = new Leaf("3");
         * c0.add(leaf1);
         * c0.add(c1);
         * c1.add(leaf2);
         * c1.add(leaf3);
         * c0.operation();
         * }
         * }
         */
    }
}
