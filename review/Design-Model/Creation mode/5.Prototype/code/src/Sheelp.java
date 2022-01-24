// 浅拷贝,若是给Sheelp添加一个对象属性(这里假设为没有任何改动的COW，实际是改动了可以深拷贝)，那就无法正常被拷贝。
public class Sheelp implements Cloneable {
    private String name;
    private int age;
    public Cow friend;

    public Sheelp(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        // 完成对基本数据类型(属性)和String的克隆
        deep = super.clone();
        // 对引用类型的属性，进行再次clone
        Sheelp sheep = (Sheelp) deep;
        sheep.friend = (Cow) friend.clone();

        return sheep;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
