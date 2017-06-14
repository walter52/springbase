package com.springbase.main;

import com.springbase.idol.Performer;
import com.springbase.idol.imp.Juggler;

/**
 * Created by walter on 2017/6/14.
 */
public class MainTask {
    public static void main(String[] args){
        System.out.println("starting......");
        Performer performer = new Juggler();
        performer.perform();
    }
}
