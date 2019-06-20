package factory.abstractfac;

import org.junit.Test;

/**
 * created by Jay on 2019/6/20
 */
public class TestAbstractFactory
{
    @Test
    public void testAbstractFactory()
    {
        CarFactory benzCarFactory = new BenzCarFactory();
        NMCar benzNMCar = benzCarFactory.createNMCar();
        YECar benzYECar = benzCarFactory.createYECar();
        benzNMCar.run();
        benzYECar.yes();


        CarFactory bmwCarFactory = new BmwCarFactory();
        NMCar bmwNMCar = bmwCarFactory.createNMCar();
        YECar bmwYECar = bmwCarFactory.createYECar();
        bmwNMCar.run();
        bmwYECar.yes();
    }


}
