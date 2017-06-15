package com.springbase.idol.imp;

import com.springbase.idol.Poem;

/**
 * Created by walter on 2017/6/15.
 */
public class Sonnet29 implements Poem {
    private static String LINES = "少壮不努力老大徒伤悲！";
    public Sonnet29(){}

    @Override
    public void recite() {
        System.out.println(LINES);
    }
}
