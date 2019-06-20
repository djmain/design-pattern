package factory.example;

/**
 * created by Jay on 2019/6/20
 */
public class HsPhoneFactory implements PhoneFactory
{
    @Override
    public AndroidPhone createAndroidPhone()
    {
        return new MeiZuPhone();
    }

    @Override
    public IPhone createIPhone()
    {
        return new IPhone8();
    }
}
