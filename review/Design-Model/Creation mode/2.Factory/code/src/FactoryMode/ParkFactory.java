package FactoryMode;

import SimpleFactory.AbstractBlock;
import SimpleFactory.Park;

public class ParkFactory implements AbstractFactory{

    @Override
    public AbstractBlock createBlock() {
        // TODO Auto-generated method stub
        return new Park();
    }
    
}
