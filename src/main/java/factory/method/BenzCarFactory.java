package factory.method;

import factory.simple.BenzCar;
import factory.simple.ICar;

/**
 * created by Jay on 2019/6/20
 */
public class BenzCarFactory implements CarFactory
{
    @Override
    public ICar create()
    {
        return new BenzCar();
    }
}
