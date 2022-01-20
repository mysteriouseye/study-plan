public class DoubleCheck {
    // 懒汉式代码效率低，那在同步前判断一下有没有实例化不就好了，若没有实例化则用同步方法new一个，否则直接return即可。即所谓的双重检查。
    // 需要用到关键字volatile，防止指令重排。如果不用volatile关键字，就会和线程不安全情形一样，在if判断那会有并发。
    private static volatile DoubleCheck instance;

    private DoubleCheck() {
    }

    public static synchronized DoubleCheck getInstance() {
        if (instance == null) {
            synchronized (DoubleCheck.class) {
                if (instance == null) {
                    instance = new DoubleCheck();
                }
            }
        }
        return instance;
    }
}
