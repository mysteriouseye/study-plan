import javafx.application.HostServices;

public abstract class HouseBuilder {
    protected House house;

    //将建造的流程写好，抽象的方法
    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void buildRoof();

    //建造好，将产品（房子）返回
    public House builderHouse(){
        return house;
    }
}
