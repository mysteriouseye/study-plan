//非享元角色
public class UnsharedConcreateFlyweight{
    private String info;

    UnsharedConcreateFlyweight(String info){
        this.info = info;
    }

    public String getInfo(){
        return info;
    }
    public void setInfo(String info){
        this.info = info;
    }
}