package com.springbase.idol.imp;

import com.springbase.idol.Performer;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import sun.misc.Perf;

/**
 * Created by walter on 2017/6/14.
 */
public class Juggler implements Performer {
    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("扔" + beanBags + "个袋子");
    }
}
