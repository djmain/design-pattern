import factory.abstractfac.BenzNMCar;
import factory.method.BenzCarFactory;
import factory.method.BmwCarFactory;
import factory.method.CarFactory;
import factory.simple.BenzCar;
import factory.simple.BmwCar;
import factory.simple.ICar;
import factory.simple.SimpleFactory;
import org.junit.Test;
import org.slf4j.ILoggerFactory;


/**
 * created by Jay on 2019/6/19
 */
public class DesignPattern
{

    /**
     * 测试简单工厂
     * 增加车的种类, 客户端引入了越来越多的依赖, 不符合迪米特法则。
     * 解决办法：减少依赖，封装创建过程
     */
    @Test
    public void testSimpleFactory1()
    {
        ICar car = new BenzCar();
        car.start();
        ICar car1 = new BmwCar();
        car1.start();
    }

    /**
     * 简单工厂改进
     * 缺点: 引入了繁琐的if--else语句
     */
    @Test
    public void testSimpleFactory2()
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICar car = simpleFactory.create1("bmw");
        car.start();
        ICar car1 = simpleFactory.create1("benz");
        car1.start();
    }

    /**
     * 简单工厂改进
     * 缺点: 需要强制转换
     */
    @Test
    public void testSimpleFactory3()
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICar car = simpleFactory.create2("BmwCar");
        car.start();
        ICar car1 = simpleFactory.create2("BenzCar");
        car1.start();
    }

    /**
     * 简单工厂终极版
     */
    @Test
    public void testSimpleFactory4()
    {
        SimpleFactory simpleFactory = new SimpleFactory();
        ICar car = simpleFactory.create3(BmwCar.class);
        car.start();
        ICar car1 = simpleFactory.create3(BenzCar.class);
        car1.start();
    }


    /**
     * 测试工厂方法
     */
    @Test
    public void testFactoryMethod()
    {
        CarFactory bmwFactory = new BmwCarFactory();
        ICar bmwCar = bmwFactory.create();
        bmwCar.start();

        CarFactory benzFactory = new BenzCarFactory();
        ICar benzCar = benzFactory.create();
        benzCar.start();
    }


}
