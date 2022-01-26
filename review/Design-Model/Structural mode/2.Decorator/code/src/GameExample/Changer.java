package GameExample;

public class Changer implements Morrigan {
    Morrigan m;

    public Changer(Morrigan m) {
        this.m = m;
    }

    @Override
    public void display() {
        // TODO Auto-generated method stub
        m.display();
    }

}
