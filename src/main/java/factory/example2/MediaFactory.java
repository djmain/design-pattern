package factory.example2;

/**
 * created by Jay on 2019/6/20
 */
public class MediaFactory implements Factory
{
    @Override
    public Fan createFan()
    {
        return new MediaFan();
    }

    @Override
    public AirCondition createAirCondition()
    {
        return new MediaAirCondition();
    }
}
