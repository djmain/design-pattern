package factory.simple;

/**
 * created by Jay on 2019/6/20
 */
public class SimpleFactory
{
    public ICar create1(String name)
    {
        if ("bmw".equals(name))
        {
            return new BmwCar();
        }
        else if ("benz".equals(name))
        {
            return new BenzCar();
        }
        return null;
    }


    public ICar create2(String className)
    {
        try
        {
            return (ICar) Class.forName(className).newInstance();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        return null;
    }


    public <T> T create3(Class<T> clazz)
    {
        try
        {
            return clazz.newInstance();
        }
        catch (InstantiationException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
