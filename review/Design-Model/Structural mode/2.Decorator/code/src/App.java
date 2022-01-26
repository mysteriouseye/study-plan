import GameExample.Girl;
import GameExample.Morrigan;
import GameExample.Original;
import GameExample.Succubus;

public class App {
    public static void main(String[] args) throws Exception {
        Component p = new ConcreteComponent();
        p.operation();
        System.out.println("---------------------------------");
        Component d = new ConcreteDecorator(p);
        d.operation();

        Morrigan m0 = new Original();
        m0.display();
        Morrigan m1 = new Succubus(m0);
        m1.display();
        Morrigan m2 = new Girl(m0);
        m2.display();
    }
}
