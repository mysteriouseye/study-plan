package FactoryMode;

import SimpleFactory.AbstractBlock;
import SimpleFactory.Empty;

public class EmptyFactory implements AbstractFactory{

    @Override
    public AbstractBlock createBlock() {
        // TODO Auto-generated method stub
        return new Empty();
    }
    
}
