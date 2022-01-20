public class StaticInnerClass {
    // 静态内部类在外部类装载时不会实例化，当调用的时候才会装载并实例化，且JVM保证了其装载时的线程安全性。也能保证懒加载和线程安全，有点像自带版的双重检查。
    private StaticInnerClass() {
    }

    private static class StaticInnerClassInstance {
        private static final StaticInnerClass instance = new StaticInnerClass();
    }

    public static synchronized StaticInnerClass getInstance() {
        return StaticInnerClassInstance.instance;
    }
}
