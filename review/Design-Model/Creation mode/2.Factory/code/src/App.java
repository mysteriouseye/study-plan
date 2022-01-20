import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import FactoryMode.AbstractFactory;
import FactoryMode.EmptyFactory;
import FactoryMode.ParkFactory;
import FactoryMode.PrisonFactory;
import SimpleFactory.AbstractBlock;
import SimpleFactory.SimpleFactoryClass;

public class App {
    public static void SimpleFactoryTest(){
        SimpleFactoryClass simpleFactoryClass = new SimpleFactoryClass();
        List<AbstractBlock> abstractBlocks = new ArrayList<>();

        String[] types = new String[3];
        types[0] = "Empty";
        types[1] = "Park";
        types[2] = "Prison";
        Random rd = new Random();
        for (int i = 0; i < 12; i++) {
            int flag = rd.nextInt(types.length);
            abstractBlocks.add(simpleFactoryClass.getBlock(types[flag]));
        }
        for (int i = 0; i < 12; i++) {
            abstractBlocks.get(i).printBlock();
            if(i == 3 || i == 5 || i == 7){
                System.out.println();
            }
            if(i == 4 || i == 6){
                System.out.print("    ");
            }
        }
    }
    // 工厂方法进一步解耦合，把工厂类抽象，不再负责所有实例的创建，而是把具体的创建工作交给了子类完成，实例化延迟到子类加载，由子类来决定要实例化的类。
    public static void FactoryModeTest(){
        List<AbstractBlock> abstractBlocks = new ArrayList<>();
        AbstractFactory abstractFactory;
        Random rd = new Random();
        for (int i = 1; i <= 12; i++) {
            int flag = rd.nextInt(3);
            if(flag == 0){
                abstractFactory = new EmptyFactory();
            }else if(flag == 1){
                abstractFactory = new ParkFactory();
            }else{
                abstractFactory = new PrisonFactory();
            }
            abstractBlocks.add(abstractFactory.createBlock());
        }
        for (int i = 0; i < 12; i++) {
            abstractBlocks.get(i).printBlock();
            if(i == 3 || i == 5 || i == 7){
                System.out.println();
            }
            if(i == 4 || i == 6){
                System.out.print("    ");
            }
        }
    }
    public static void main(String[] args) throws Exception {
        SimpleFactoryTest();
        System.out.println("");
        FactoryModeTest();
    }  
}
