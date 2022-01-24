import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import AbstractFactoryMode.MagicFactory;
import AbstractFactoryMode.NormalFactory;
import FactoryMode.AbstractFactory;
import FactoryMode.EmptyFactory;
import FactoryMode.ParkFactory;
import FactoryMode.PrisonFactory;
import SimpleFactory.AbstractBlock;
import SimpleFactory.SimpleFactoryClass;

public class App {
    public static void SimpleFactoryTest() {
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
            if (i == 3 || i == 5 || i == 7) {
                System.out.println();
            }
            if (i == 4 || i == 6) {
                System.out.print("    ");
            }
        }
    }

    // 工厂方法进一步解耦合，把工厂类抽象，不再负责所有实例的创建，而是把具体的创建工作交给了子类完成，实例化延迟到子类加载，由子类来决定要实例化的类。
    public static void FactoryModeTest() {
        List<AbstractBlock> abstractBlocks = new ArrayList<>();
        AbstractFactory abstractFactory;
        Random rd = new Random();
        for (int i = 1; i <= 12; i++) {
            int flag = rd.nextInt(3);
            if (flag == 0) {
                abstractFactory = new EmptyFactory();
            } else if (flag == 1) {
                abstractFactory = new ParkFactory();
            } else {
                abstractFactory = new PrisonFactory();
            }
            abstractBlocks.add(abstractFactory.createBlock());
        }
        for (int i = 0; i < 12; i++) {
            abstractBlocks.get(i).printBlock();
            if (i == 3 || i == 5 || i == 7) {
                System.out.println();
            }
            if (i == 4 || i == 6) {
                System.out.print("    ");
            }
        }
    }

    public static void AbstractFactoryMode(AbstractFactoryMode.AbstractFactory af) {

        ArrayList<AbstractBlock> map = new ArrayList<>();
        map.add(af.getEmpty());
        map.add(af.getPrison());
        map.add(af.getPark());
        Random rd = new Random(3);
        int col = 12;
        for (int i = 1; i <= col; i++) {
            int tt = rd.nextInt(3);
            map.get(tt).printBlock();
            if (i == 4 || i == 6 || i == 8)
                System.out.println();
            if (i == 5 || i == 7)
                System.out.print("    ");
        }
    }

    public static void main(String[] args) throws Exception {
        SimpleFactoryTest();
        System.out.println("");
        FactoryModeTest();
        System.out.println("");
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入指令（1输出普通地图，2输出魔法地图）");
        int order;
        order = scan.nextInt();
        if (order == 1) {
            AbstractFactoryMode(new NormalFactory());
        } else {
            AbstractFactoryMode(new MagicFactory());
        }
        scan.close();
    }
}
