package com.springbase.idol.imp;

/**
 * Created by walter on 2017/6/15.
 */
public class Stage {
    private Stage(){
        System.out.println("舞台");
    }
    private static class StageSingleHolder{
        private final static Stage instance = new Stage();
    }

    public static Stage getInstance(){
        return StageSingleHolder.instance;
    }

}
