package com.godwar.dubbo;

/**
 * @author godwar
 * @Date 2020/5/14
 **/
public class SleepServiceImpl implements ISleepService {
    @Override
    public String sleepTime(String time) {
        return time;
    }
}
