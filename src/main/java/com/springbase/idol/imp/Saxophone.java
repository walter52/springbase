package com.springbase.idol.imp;

import com.springbase.idol.Instrument;

/**
 * Created by walter on 2017/6/22.
 */
public class Saxophone implements Instrument {
    @Override
    public void play() {
        System.out.println("play萨克斯管");
    }
}
