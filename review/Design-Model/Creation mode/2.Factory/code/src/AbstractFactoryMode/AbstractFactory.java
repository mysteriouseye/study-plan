package AbstractFactoryMode;

import SimpleFactory.AbstractBlock;

public interface AbstractFactory {
    AbstractBlock getEmpty();
    AbstractBlock getPrison();
    AbstractBlock getPark();
}
