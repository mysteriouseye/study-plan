package FactoryMode;

import SimpleFactory.AbstractBlock;
import SimpleFactory.Prison;

public class PrisonFactory implements AbstractFactory{

    @Override
    public AbstractBlock createBlock() {
        // TODO Auto-generated method stub
        return new Prison();
    }
    
}
