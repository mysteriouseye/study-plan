package GameExample;

public class Succubus extends Changer{

    public Succubus(Morrigan m) {
        super(m);
        //TODO Auto-generated constructor stub
    }
    public void display(){
        setChanger();
        super.display();
    }
    public void setChanger(){
        ((Original) super.m).setImage("Morrigan1.jpg");
    }
}
