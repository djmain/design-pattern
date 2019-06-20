package factory.example2;

/**
 * created by Jay on 2019/6/20
 */
public class MediaAirCondition implements AirCondition
{
    @Override
    public void cold()
    {
        System.out.println("media air condition is colding.");
    }
}
