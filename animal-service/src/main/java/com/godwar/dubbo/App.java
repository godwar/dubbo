package com.godwar.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"application.xml"}) ;
        IEatService eatService = (IEatService) classPathXmlApplicationContext.getBean("eatService");
        System.out.println(  eatService.eat("鱼"));

    }
}
