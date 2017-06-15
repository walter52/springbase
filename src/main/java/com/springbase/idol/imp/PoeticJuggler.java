package com.springbase.idol.imp;

import com.springbase.idol.Poem;

/**
 * Created by walter on 2017/6/15.
 */
public class PoeticJuggler extends Juggler {
    private Poem poem;

    public PoeticJuggler(int beanBags,Poem poem){
        super(beanBags);
        this.poem = poem;
    }

    @Override
    public void perform() {
        super.perform();
        poem.recite();
    }
}
