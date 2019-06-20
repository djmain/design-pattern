package factory.method;

import factory.simple.BmwCar;
import factory.simple.ICar;

/**
 * created by Jay on 2019/6/20
 */
public class BmwCarFactory implements CarFactory
{
    @Override
    public ICar create()
    {
        return new BmwCar();
    }
}
