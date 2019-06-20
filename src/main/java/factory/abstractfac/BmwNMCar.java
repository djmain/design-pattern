package factory.abstractfac;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * created by Jay on 2019/6/20
 */
public class BmwNMCar implements NMCar
{
    @Override
    public void run()
    {
        System.out.println("bmw nm car running.");
    }
}
