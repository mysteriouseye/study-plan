public class Leaf implements Component{
    private String name;
    public Leaf(String name) {
        this.name = name;
    }

    @Override
    public void add(Component c) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public Component getChild(int i) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void operation() {
        // TODO Auto-generated method stub
        System.out.println("tree" + name + "is operation!");
    }

    @Override
    public void remove(Component c) {
        // TODO Auto-generated method stub

    }

}