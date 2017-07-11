package com.springbase.idol.imp;

import com.springbase.idol.Instrument;

/**
 * Created by walter on 2017/7/10.
 */
public class Guitar implements Instrument {
    @Override
    public void play() {
        System.out.println("play吉他");
    }
}
