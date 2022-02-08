import java.util.HashMap;

//享元工厂角色
public class FlyWeightFactory {
    private HashMap<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyWeight(String key){
        Flyweight flyweight = flyweights.get(key);
        if(flyweight != null){
            System.out.println("具体享元"+ key + "已经获取！");
        }else{
            flyweight = new ConcreteFlyweight(key);
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
