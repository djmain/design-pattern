package factory.abstractfac;

/**
 * created by Jay on 2019/6/20
 */
public class BmwCarFactory implements CarFactory
{
    @Override
    public NMCar createNMCar()
    {
        return new BmwNMCar();
    }

    @Override
    public YECar createYECar()
    {
        return new BmwYECar();
    }
}
