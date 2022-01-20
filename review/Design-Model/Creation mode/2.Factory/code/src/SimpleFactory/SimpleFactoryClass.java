package SimpleFactory;

public class SimpleFactoryClass{
    public AbstractBlock getBlock(String type){
        if (type.equalsIgnoreCase("Empty")) {
            return new Empty();
        }else if(type.equalsIgnoreCase("Park")){
            return new Park();
        }else if(type.equalsIgnoreCase("Prison")){
            return new Prison();
        }
        return null;
    }
}