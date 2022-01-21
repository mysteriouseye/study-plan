package AbstractFactoryMode;

import SimpleFactory.AbstractBlock;

public class NormalFactory implements AbstractFactory{

    @Override
    public AbstractBlock getEmpty() {
        // TODO Auto-generated method stub
        return new NormalEmpty();
    }

    @Override
    public AbstractBlock getPrison() {
        // TODO Auto-generated method stub
        return new NormalPrison();
    }

    @Override
    public AbstractBlock getPark() {
        // TODO Auto-generated method stub
        return new NormalPark();
    }
    
}
