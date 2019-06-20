package factory.example;

/**
 * created by Jay on 2019/6/20
 */
public class XiaoMiPhone implements AndroidPhone
{
    @Override
    public void run()
    {
        System.out.println("小米phone is running.");
    }
}
