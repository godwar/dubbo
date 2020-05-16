package com.godwar.dubbo;

/**
 * @author godwar
 * @Date 2020/5/13
 **/
public class EatServiceImpl implements IEatService {
    @Override
    public String eat(String food ) {
        System.out.println("like eat" + food);
        return "Hello Dobbo" + food  ;
    }
}
