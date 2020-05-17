package com.godwar.dubbo;

import org.apache.dubbo.container.Main;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
  /*      ClassPathXmlApplicationContext classPathXmlApplicationContext =
                new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/application.xml"}) ;
        classPathXmlApplicationContext.start();
        System.in.read();*/
        Main.main(args);
    }
}
