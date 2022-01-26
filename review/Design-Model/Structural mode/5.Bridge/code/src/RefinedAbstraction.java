public class RefinedAbstraction extends Abstraction{

    protected RefinedAbstraction(Implementor imple) {
        super(imple);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void Operation() {
        // TODO Auto-generated method stub
        System.out.println("扩展抽象化角色被访问");
        imple.OperationImpl();
    }
    
}
