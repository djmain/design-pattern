import factory.BenzCar;
import factory.ICar;
import org.junit.Test;


/**
 * created by Jay on 2019/6/19
 */
public class DesignPattern
{

    /**
     * 测试简单工厂
     */
    @Test
    public void testSimpleFactory()
    {
        ICar car = new BenzCar();
        car.start();
    }
}
