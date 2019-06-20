package factory.example;

/**
 * created by Jay on 2019/6/20
 */
public class FskPhoneFactory implements PhoneFactory
{

    @Override
    public AndroidPhone createAndroidPhone()
    {
        return new XiaoMiPhone();
    }

    @Override
    public IPhone createIPhone()
    {
        return new IPhoneX();
    }
}
