package factory.example2;

/**
 * created by Jay on 2019/6/20
 */
public class GeLiFactory implements Factory
{
    @Override
    public Fan createFan()
    {
        return new GeLiFan();
    }

    @Override
    public AirCondition createAirCondition()
    {
        return new GeLiAirCondition();
    }
}
