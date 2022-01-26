package GameExample;

public class Girl extends Changer{

    public Girl(Morrigan m) {
        super(m);
        //TODO Auto-generated constructor stub
    }
    public void display(){
        setChanger();
        super.display();
    }
    public void setChanger(){
        ((Original) super.m).setImage("Morrigan2.jpg");
    }
}
