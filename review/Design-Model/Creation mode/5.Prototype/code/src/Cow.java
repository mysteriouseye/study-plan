//要实现深拷贝，方法一就是必须在这里实现Cloneable接口
public class Cow implements Cloneable {
    private String name;
    private int age;

    public Cow(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // TODO Auto-generated method stub
        return super.clone();
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Cow{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
