public class LazySingleton {
    // 懒汉式单例 该模式的特点是类加载时没有生成单例，只有当第一次调用 getlnstance 方法时才去创建这个单例。代码如下：
    private static volatile LazySingleton instance = null; // 保证instance在所有线程中同步

    private LazySingleton() {
    } // private修饰 避免类在外部被实例化

    // 线程安全
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
