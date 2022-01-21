package AbstractFactoryMode;

import SimpleFactory.AbstractBlock;

public class MagicFactory implements AbstractFactory{

    @Override
    public AbstractBlock getEmpty() {
        // TODO Auto-generated method stub
        return new MagicEmpty();
    }

    @Override
    public AbstractBlock getPrison() {
        // TODO Auto-generated method stub
        return new MagicPrison();
    }

    @Override
    public AbstractBlock getPark() {
        // TODO Auto-generated method stub
        return new MagicPark();
    }
    
}
