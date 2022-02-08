package Example;

import java.util.ArrayList;

public class Bags implements Articles{
    private String name;
    private ArrayList<Articles> bags = new ArrayList<Articles>();

    
    public Bags(String name) {
        this.name = name;
    }
    public void add(Articles c) {
        bags.add(c);
    }
    public void remove(Articles c) {
        bags.remove(c);
    }
    public Articles getChild(int i) {
        return bags.get(i);
    }

    @Override
    public float caculator() {
        // TODO Auto-generated method stub
        float result = 0;
        for (Object obj : bags) {
            result += ((Articles)obj).caculator();
        }
        return result;
    }

    @Override
    public void show() {
        // TODO Auto-generated method stub
        for (Object obj : bags) {
            ((Articles) obj).show();
        }
    }
    
}
